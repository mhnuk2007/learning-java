#!/bin/bash

# Replace these with your own GitHub values
REPO="mhnuk2007/learning-java"
PROJECT_NUMBER=1
PROJECT_OWNER="mhnuk2007"

ISSUES=(
  "Learn Java Variables and Data Types"
  "Understand Operators in Java"
  "Master Control Structures in Java"
  "Learn Object-Oriented Programming (OOP)"
  "Practice Exception Handling"
  "Understand Collections Framework"
  "Learn Modern Java Features (Java 8+)"
  "Practice Testing & Patterns in Java"
  "Learn JDBC & MySQL for Database Handling"
)

for ISSUE_TITLE in "${ISSUES[@]}"; do
  # Create GitHub issue
  ISSUE_URL=$(gh issue create --repo "$REPO" --title "$ISSUE_TITLE" --body "Auto-created issue for: $ISSUE_TITLE" --assignee "@me" --label "java-learning" --json url -q ".url")

  if [[ -n "$ISSUE_URL" ]]; then
    echo "✅ Created: $ISSUE_TITLE"

    # Add issue to GitHub Project (Beta)
    gh project item-add "$
