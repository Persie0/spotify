package io.ably.lib.types;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public enum ChannelMode {
    presence(ProtocolMessage.Flag.presence),
    publish(ProtocolMessage.Flag.publish),
    subscribe(ProtocolMessage.Flag.subscribe),
    presence_subscribe(ProtocolMessage.Flag.presence_subscribe);

    private final int mask;

    ChannelMode(ProtocolMessage.Flag flag) {
        this.mask = flag.getMask();
    }

    public static Set<ChannelMode> toSet(int i) {
        HashSet hashSet = new HashSet();
        for (ChannelMode channelMode : values()) {
            int mask = channelMode.getMask();
            if ((i & mask) == mask) {
                hashSet.add(channelMode);
            }
        }
        return hashSet;
    }

    public int getMask() {
        return this.mask;
    }
}
