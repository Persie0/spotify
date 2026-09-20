package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hn80;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vr50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemExtensionPolicy extends AbstractC0269h implements sre0 {
    private static final ItemExtensionPolicy DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 2;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int extension_;
    private int linkType_;

    static {
        ItemExtensionPolicy itemExtensionPolicy = new ItemExtensionPolicy();
        DEFAULT_INSTANCE = itemExtensionPolicy;
        AbstractC0269h.registerDefaultInstance(ItemExtensionPolicy.class, itemExtensionPolicy);
    }

    private ItemExtensionPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18313n(ItemExtensionPolicy itemExtensionPolicy, ntx ntxVar) {
        itemExtensionPolicy.getClass();
        itemExtensionPolicy.extension_ = ntxVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m18314o(ItemExtensionPolicy itemExtensionPolicy, int i) {
        itemExtensionPolicy.extension_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m18315p(ItemExtensionPolicy itemExtensionPolicy, hn80 hn80Var) {
        itemExtensionPolicy.getClass();
        itemExtensionPolicy.linkType_ = hn80Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static vr50 m18316q() {
        return (vr50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"linkType_", "extension_"});
        }
        if (iOrdinal == 3) {
            return new ItemExtensionPolicy();
        }
        if (iOrdinal == 4) {
            return new vr50(DEFAULT_INSTANCE);
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
        synchronized (ItemExtensionPolicy.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
