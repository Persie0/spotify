package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoveMemberAction extends AbstractC0269h implements sre0 {
    private static final RemoveMemberAction DEFAULT_INSTANCE;
    public static final int DEFAULT_REMOVE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_WITH_DOWNGRADE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 10;
    public static final int UBI_ID_FIELD_NUMBER = 11;
    private Object type_;
    private int typeCase_ = 0;
    private String title_ = "";
    private String ubiId_ = "";

    static {
        RemoveMemberAction removeMemberAction = new RemoveMemberAction();
        DEFAULT_INSTANCE = removeMemberAction;
        AbstractC0269h.registerDefaultInstance(RemoveMemberAction.class, removeMemberAction);
    }

    private RemoveMemberAction() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u000b\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\nȈ\u000bȈ", new Object[]{"type_", "typeCase_", DefaultRemoveActionType.class, RemoveWithDowngradeActionType.class, "title_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new RemoveMemberAction();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 2);
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
        synchronized (RemoveMemberAction.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final RemoveWithDowngradeActionType m10754n() {
        return this.typeCase_ == 2 ? (RemoveWithDowngradeActionType) this.type_ : RemoveWithDowngradeActionType.m10767n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m10755o() {
        int i = this.typeCase_;
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

    /* JADX INFO: renamed from: p */
    public final String m10756p() {
        return this.ubiId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
