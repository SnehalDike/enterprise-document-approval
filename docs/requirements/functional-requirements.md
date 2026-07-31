# Functional Requirements

## Project Overview

Enterprise Document Approval System is a workflow application used to manage document review and approval through role-based access control and work buckets.

---

## Actors

- Admin
- Team Lead
- Team Member

---

## Admin Features

- Login
- Create, update, disable users
- Assign roles
- Upload blocked documents
- Create document categories
- View all documents
- Search documents
- Reassign documents (future enhancement)

---

## Team Lead Features

- Login
- Create buckets
- Update buckets
- Delete buckets
- Assign categories to buckets
- Add or remove team members
- View bucket statistics
- Claim documents awaiting approval
- Approve or reject reviewed documents
- View workflow history

---

## Team Member Features

- Login
- View assigned buckets
- Claim documents
- Download PDF
- Review documents
- Approve review
- Reject review
- Add review comments
- View previously claimed documents

---

## Document Features

- Upload PDF
- Store metadata
- Download PDF
- Search by policy number
- Search by product
- Search by status
- Search by category

---

## Workflow Features

- Claim document
- Release document (future enhancement)
- Submit for approval
- Reject review
- Final approval
- Final rejection
- Maintain audit history