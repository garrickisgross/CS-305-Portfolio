# CS-305-Portfolio
Artemis Financial


## Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a consulting company that develops personalized financial plans for clients, covering areas such as savings, retirement, investments, and insurance. The company sought to modernize its operations while ensuring the highest level of security for client data. Specifically, Artemis Financial required a secure data verification mechanism in its web application. To meet this requirement, they requested the implementation of a checksum verification step using cryptographic hashing to protect data integrity during transfers.

## What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

One of the key successes in assessing Artemis Financial’s security vulnerabilities was identifying potential risks in unsecured data transmissions. Implementing the SHA-256 cryptographic hash and using a bytesToHex function ensured that transmitted data could be verified, preventing tampering and corruption.

## Which part of the vulnerability assessment was challenging or helpful to you?

It was helpful to analyze Artemis Financial’s existing software infrastructure and identify areas that lacked proper encryption or verification. This process reinforced the importance of a layered security approach rather than relying on a single safeguard.

## How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

To increase security layers, I implemented cryptographic hashing for data verification, ensuring that transmitted data remained unaltered. As well as certificate signing to implement HTTPS. 

## How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I used automated security testing tools to scan for newly introduced vulnerabilities. Static analysis helped ensure the application remained secure and performant.

## What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Throughout this project, I leveraged various resources and tools, including:

Cryptographic libraries
Secure coding guidelines
Version control
Automated security scanners
These tools and practices will be beneficial for future assignments where security is a priority.

## Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

Implementation of SHA-256 hashing for data integrity – demonstrating my understanding of cryptographic principles.
Code samples that follow secure coding best practices – highlighting my ability to write maintainable and secure software.
Vulnerability assessment documentation – showing my process for identifying and mitigating risks.
Testing results – proving my ability to validate security measures effectively.




