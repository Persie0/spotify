package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ActivityRequestOrBuilder extends sre0 {
    AckType getAckType();

    int getAckTypeValue();

    ActivityRequest.ArCase getArCase();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    EmojiReaction getEmojiReaction();

    ReactionEmoti getReactionEmoti();

    int getReactionEmotiValue();

    ReceiptType getReceiptType();

    int getReceiptTypeValue();

    boolean hasAckType();

    boolean hasEmojiReaction();

    boolean hasReactionEmoti();

    boolean hasReceiptType();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
