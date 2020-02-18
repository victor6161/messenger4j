package com.github.messenger4j.webhook.event;

import java.time.Instant;
import java.util.Optional;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author Max Grabenhorst
 * @since 1.0.0
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class MessageEchoEvent extends BaseEvent {

  private final String messageId;
  private final Optional<String> appId;
  private final Optional<String> metadata;

  public MessageEchoEvent(
      @NonNull String senderId,
      @NonNull String recipientId,
      @NonNull Instant timestamp,
      @NonNull String messageId,
      @NonNull Optional<String> appId,
      @NonNull Optional<String> metadata) {
    super(senderId, recipientId, timestamp);
    this.messageId = messageId;
    this.appId = appId;
    this.metadata = metadata;
  }

  public String messageId() {
    return messageId;
  }

  public Optional<String> appId() {
    return appId;
  }

  public Optional<String> metadata() {
    return metadata;
  }
}
