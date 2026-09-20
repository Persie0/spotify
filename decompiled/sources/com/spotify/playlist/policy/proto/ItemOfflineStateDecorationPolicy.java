package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ku50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemOfflineStateDecorationPolicy extends AbstractC0269h implements sre0 {
    private static final ItemOfflineStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 3;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean locallyPlayable_;
    private boolean offlineState_;
    private boolean syncProgress_;

    static {
        ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy = new ItemOfflineStateDecorationPolicy();
        DEFAULT_INSTANCE = itemOfflineStateDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ItemOfflineStateDecorationPolicy.class, itemOfflineStateDecorationPolicy);
    }

    private ItemOfflineStateDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18322n(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy, boolean z) {
        itemOfflineStateDecorationPolicy.locallyPlayable_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m18323o(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy, boolean z) {
        itemOfflineStateDecorationPolicy.offlineState_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m18324p(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy, boolean z) {
        itemOfflineStateDecorationPolicy.syncProgress_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ItemOfflineStateDecorationPolicy m18325q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static ku50 m18326r() {
        return (ku50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"offlineState_", "syncProgress_", "locallyPlayable_"});
        }
        if (iOrdinal == 3) {
            return new ItemOfflineStateDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new ku50(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ItemOfflineStateDecorationPolicy.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    public final boolean getOfflineState() {
        return this.offlineState_;
    }

    public final boolean getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
