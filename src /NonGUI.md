# Non-GUI Class Diagram

**Library NonGUI Design**:

                                            +------------------------+        +--------+
                                            |       Department       | <----- | NonGUI |
                                            |------------------------|        +--------+
                                            |  + Name: String        |
                                            |  + Description: String |
                                            +------------------------+                                  +------------------------+
                                                        ^                                               |         Author         |
                                                        v                                               |------------------------|
                                                        | + Bookcases                                   | + FirstName: String    |
                                                        |                                               | + LastName: String     |
                                               +------------------+                                     | + BirthDate: DateTime  |
                                               |     Bookcase     |                                     | + Bio: String          |
                                               |------------------|                                     |------------------------|
                                               | + Label: String  |                                     |                        |
                                               |------------------|                                     +------------------------+
                                               |                  |                                        + Authors ^
                                               +------------------+                                                  |
                                                        ^                                                            |                                  +------------------------+
                                                        v                                                    + Books v                                  |     <<emumeration>>    |
                                                        | + BookShelves                                 +------------------------+                      |         Genre          |
                                                        |                                               |          Book          |                      |------------------------|
                                               +------------------+                                     |------------------------|                      | Adventure              |
                                               |    Bookshelf     |                                     | + Name: String         |                      | Contemporary           |
                                               |------------------|                                     | + Description: String  |--------------------->| Fantasy                |
                                               | + Label: String  |                                     | + Keywords: String     |                      | Horror                 |
                                               |------------------|                                     |------------------------|                      | Mystery                |
                                               |                  |                                     |                        |                      | Romance                |
                                               +------------------+                                     +------------------------+                      | Thriller               |
                                                        ^                                                    + Book  ^                                  +------------------------+
                                                        v                                                            | 
                                                        |                                                            |
                                                        |                                                   + Copies v
       +--------------------------+        +---------------------------+                                +------------------------+                      +-----------------------+
       |  BookLoanLog             |        |         BookCopy          |                                |       BookEdition      |                      |      Publisher        |
       |--------------------------|        |---------------------------|                                |------------------------|                      |-----------------------|
       | + LentFromDate: DateTime |        | + LentFromDate: DateTime  |                                | + ISBN: String         |                      | + Name: String        |
       | + LentToDate: DateTime   |<>----->| - MaximumLentTo: DateTime |<------------------------------>| + Year: Integer        |<-------------------->| + Description: String |
       | + NoteString             |        |---------------------------| + Copies            + Edition  | + Page: Integer        |                      |-----------------------|
       |--------------------------|        |                           |                                | + FinancialValue: Real |                      |                       |
       |                          |        +---------------------------+                                |------------------------|                      +-----------------------+
       +--------------------------+           ^ + Borrowed Books    |                                   |                        |
                    |                         |                     |                                   +------------------------+
                    |                         | + Lender            ------------------------------------
                    |                         v                                                        |
                    |                     +------------------------------+                             |
                    |                     |           Member             |                             | 
                    |                     |------------------------------|                             |
                    |                     | + MemberID: String           |      +-----------------+    |
                    |                     | + FirstName: String          |      | <<emumeration>> |    |
                    |                     | + LastName: String           |      |    MemberType   |    |
                    --------------------->| + Address: String            |----->|-----------------|    |
                                          | + RegistrationDate: DateTime |      | Standard        |    |
                                          | + ExpiryDate: DateTime       |      | VIP             |    |
                                          | + IsActive: Boolean          |      +-----------------+    |
                                          |------------------------------|                             |
                                          | + GetBorrowedBookCount();    |                             |
                                          +------------------------------+                             |
                                                         ^                                             |
                                                         V                                             |
                                                         |                 +----------------------+    |
                                                         |                 |       Reminder       |    |
                                                         |                 |----------------------|    |
                                                         ------------------| +SendDate: DateTime  |-----
                                                               + Reminders | Note: String         |
                                                                           | isResolved: Boolean  |
                                                                           +----------------------+
