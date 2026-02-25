# Notification System Challenge - Stage 3

Welcome to Stage 3 of the multi-stage notification system challenge! 🎯

## 🏗️ What is this?

This is a **shared repository** where multiple participants will implement their own notification solutions. You'll work alongside other developers, each creating your own implementation while sharing the same core abstractions.

## 🎯 Stage 3 Goals

In this stage, you'll focus on **object design and collaboration**:
- Create domain objects (Recipient, Message, Notification)
- Implement notification senders for different channels using strongly-typed Channel enum
- Use NotificationService to send notifications
- Demonstrate usage with a simple main() method

**Important**: 
- No real notifications are sent! This focuses on design and structure, not external integrations
- No console input (Scanner) - that will come in Stage 4
- At this stage, we focus on how objects collaborate. Interaction will be added later.

## 🚀 Multi-Stage Roadmap

- **Stage 3** (Current): Object design and programmatic usage
- **Stage 4** (Future): Console interaction + multiple channels with priority
- **Stage 5** (Future): Notification history and retry logic

## 📁 Repository Structure

### Shared Components (Don't modify these!)
```
src/main/java/com/kw/javachallenges/notification/
├── README.md                    # This file
├── model/
│   ├── Notification.java        # Core notification interface
│   ├── BasicNotification.java   # Basic implementation
│   ├── Recipient.java           # Recipient domain object
│   ├── UserRecipient.java       # Basic recipient implementation
│   ├── Message.java             # Message domain object
│   └── TextMessage.java         # Basic message implementation
├── sender/
│   └── NotificationSender.java  # Channel sender interface
└── service/
    └── NotificationService.java # Main business logic
```

### Your Implementation Space
```
src/main/java/com/kw/javachallenges/notification/participants/
└── <your-name>/                 # Your personal package
    ├── EmailNotificationSender.java
    ├── SmsNotificationSender.java
    └── NotificationDemo.java
```

## 🛠️ How to Add Your Implementation

1. **Create your participant package**:
   ```
   src/main/java/com/kw/javachallenges/notification/participants/<your-name>/
   ```

2. **Copy the example structure**:
   - Look at the `participants/example/` package
   - Copy the structure using your own package name
   - Implement your own notification senders

3. **Implement NotificationSender**:
   ```java
   public class YourEmailSender implements NotificationSender {
       @Override
       public Channel getChannel() {
           return Channel.EMAIL; // Use strongly-typed enum for type safety
       }
       
       @Override
       public String send(Notification notification) {
           // Access recipient and message through domain objects
           String address = notification.getRecipient().getAddress();
           String content = notification.getMessage().getContent();
           return "Your custom message format";
       }
   }
   ```

4. **Create your demo class**:
   - Create a main() method to demonstrate your solution
   - Manually create domain objects (UserRecipient, TextMessage)
   - Create NotificationService with your senders
   - Show how notifications are sent programmatically

## 🎮 Running the Code

### Run the example:
```bash
# Compile and run the example participant
javac -cp src/main/java src/main/java/com/kw/javachallenges/notification/participants/example/NotificationDemo.java
java -cp src/main/java com.kw.javachallenges.notification.participants.example.NotificationDemo
```

### Run your implementation:
```bash
# Replace <your-name> with your actual package name
java -cp src/main/java com.kw.javachallenges.notification.participants.<your-name>.NotificationDemo
```

### Run tests:
```bash
mvn test
```

## 🧪 What You'll Build

Your demo class should:
1. Create recipient and message objects programmatically
2. Create notification sender implementations
3. Create a NotificationService with your senders
4. Demonstrate sending notifications through different channels
5. Display the results

Example output:
```
=== Notification System Demo (Stage 3) ===
Email demo: Email sent to john@example.com: Hello, this is a test notification!
SMS demo: SMS sent to john@example.com: Hello, this is a test notification!
```

## 📐 Design Principles

### ✅ Do This:
- Focus on clean, simple code
- Follow the existing patterns
- Make your channel implementations unique
- Keep demo logic separate from business logic
- Test your implementation thoroughly
- Use Channel enum for type safety instead of string literals

### ❌ Don't Do This:
- Modify shared interfaces or core classes
- Add external libraries or frameworks
- Implement Stage 4/5 features now
- Over-engineer the solution
- Modify other participants' code

## 🔮 Preparing for Future Stages

Your Stage 3 design now uses **domain objects** for Recipients and Messages. These are intentionally simple now but will be expanded in future stages to support:

**Future possibilities for Recipients:**
- Targeting recipients by attributes (age, role, preferences)
- Grouping recipients for bulk notifications
- Recipient filtering and validation

**Future possibilities for Messages:**
- Content filtering and validation
- Message templates and personalization
- Priority and urgency levels

**Stage roadmap:**
- **Stage 4**: Console interaction + sending to multiple channels with priorities
- **Stage 5**: Adding history tracking and retry logic

The current `NotificationService.sendNotification()` method will be extended, not replaced!

## 🤝 Collaboration Rules

- **Shared**: Core abstractions, interfaces, tests, and this README
- **Personal**: Everything in your `participants/<your-name>/` package
- **Respect**: Don't modify other participants' implementations
- **Learn**: Feel free to read others' code for inspiration

## 💡 Tips for Success

1. **Start with the example**: Understand how it works first
2. **Keep it simple**: Don't over-complicate Stage 3
3. **Think ahead**: Consider how your design will evolve
4. **Be creative**: Make your senders distinctive and interesting
5. **Test thoroughly**: Ensure your implementation works correctly

## 🎉 Have Fun!

This challenge is about learning, collaboration, and clean code design. Don't hesitate to be creative with your notification formats while keeping the core abstractions intact.

Happy coding! 🚀