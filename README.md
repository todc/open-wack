# TODO

### What do we call the "thing" users are acknowledging?
document set
campaign
policy

### Pages
  - login
  - view all signed/unsigned docs
  - view/sign doc
  - (owner) view all campaigns
  - (owner) view campaign details
    - preview email, reminder content
    - preview website content
    - send initial email blast, reminders
    - add/remove recipients
    - view/search ack/nacks
    - download ack/nack report
    - add/remove co-owners (if campaign owner)
    - schedule reports, reminders
  - (owner) edit campaign details
    - email from, reply-to, subject, message, attachments
    - website content
  - (admin) create new campaign
    - define any custom data fields to collect
  - (admin) manage users (optional sync with AD)
  - (admin) manage groups
  - (admin) manage authentication
  - (admin) customize app branding
  
  
### DB Schema
  √ users
  √ user_privileges
  √ groups
  √ campaigns
  √ campaign_managers
  √ campaign_attachments
  √ campaign_acknowledgements
  √ campaign_emails (versioned campaign email config)
  √ campaign_email_deliveries (log of who received which emails and when)
  √ campaign_custom_fields
  √ campaign_custom_field_values
  