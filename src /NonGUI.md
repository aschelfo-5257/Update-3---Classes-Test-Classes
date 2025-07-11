# NonGUI Class Diagram

**Libary NonGUI Design**:

                                            +------------------------+        +--------+
                                            |       Department       | <----- | NonGUI |
                                            |------------------------|        +--------+
                                            |  + Name: String        |
                                            |  + Description: String |
                                            +------------------------+
                                                        ^
                                                        v
                                                        | + Bookcases
                                                        |
                                               +------------------+
                                               |     Bookcase     |
                                               |------------------| -----> 
                                               | + Label: String  |
                                               |------------------|
                                               |                  |
                                               +------------------+
                                                        ^
                                                        v
                                                        | + BookShelves
                                                        |
                                               +------------------+
                                               |    Bookshelf     |
                                               |------------------|
                                               | + Label: String  |
                                               |------------------|
                                               |                  |
                                               +------------------+
                                                        ^
                                                        v
                                                        |
                                                        |
       +--------------------------+        +---------------------------+
       |  BookLoanLog             |        |         BookCopy          |
       |--------------------------|        |---------------------------|
       | + LentFromDate: DateTime |        | + LentFromDate: DateTime  |
       | + LentToDate: DateTime   |<>----->| - MaximumLentTo: DateTime |
       | + NoteString             |        |---------------------------|
       |--------------------------|        |                           |
       |                          |        +---------------------------+
       +--------------------------+           ^ + Borrowed Books    |
                    |                         |                     |
                    |                         | + Lender            ----------------------------------
                    |                         v
                    |                     +------------------------------+
                    |                     |           Member             |
                    |                     |------------------------------|
                    |                     | + MemberID: String           |      +-----------------+
                    |                     | + FirstName: String          |      | <<emumeration>> |
                    |                     | + LastName: String           |      |    MemberType   |
                    --------------------->| + Address: String            |----->|-----------------| 
                                          | + RegistrationDate: DateTime |      |  
                                          | + ExpiryDate: DateTime       |
                                          | + IsActive: Boolean          |
                                          |------------------------------|
                                          | + GetBorrowedBookCount();    |
                                          +------------------------------+
