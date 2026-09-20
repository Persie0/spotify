package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d8c0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ManagedAccountIdentifier extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ManagedAccountIdentifier DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEEN_ID_FIELD_NUMBER = 2;
    private int identifierCase_ = 0;
    private Object identifier_;

    static {
        ManagedAccountIdentifier managedAccountIdentifier = new ManagedAccountIdentifier();
        DEFAULT_INSTANCE = managedAccountIdentifier;
        AbstractC0269h.registerDefaultInstance(ManagedAccountIdentifier.class, managedAccountIdentifier);
    }

    private ManagedAccountIdentifier() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12505n(ManagedAccountIdentifier managedAccountIdentifier, String str) {
        managedAccountIdentifier.getClass();
        str.getClass();
        managedAccountIdentifier.identifierCase_ = 1;
        managedAccountIdentifier.identifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12506o(ManagedAccountIdentifier managedAccountIdentifier, String str) {
        managedAccountIdentifier.getClass();
        str.getClass();
        managedAccountIdentifier.identifierCase_ = 2;
        managedAccountIdentifier.identifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ManagedAccountIdentifier m12507p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static d8c0 m12508s() {
        return (d8c0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"identifier_", "identifierCase_"});
        }
        if (iOrdinal == 3) {
            return new ManagedAccountIdentifier();
        }
        if (iOrdinal == 4) {
            return new d8c0(DEFAULT_INSTANCE);
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
        synchronized (ManagedAccountIdentifier.class) {
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

    public final String getChildId() {
        return this.identifierCase_ == 1 ? (String) this.identifier_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final int m12509q() {
        int i = this.identifierCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: r */
    public final String m12510r() {
        return this.identifierCase_ == 2 ? (String) this.identifier_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
