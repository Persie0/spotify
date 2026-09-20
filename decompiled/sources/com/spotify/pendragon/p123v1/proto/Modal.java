package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rkh0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Modal extends AbstractC0269h implements sre0 {
    public static final int BASE_MODAL_FIELD_NUMBER = 4;
    public static final int BASIC_MODAL_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 2;
    private static final Modal DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private Object modalTemplate_;
    private int modalTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();
    private String type_ = "";

    static {
        Modal modal = new Modal();
        DEFAULT_INSTANCE = modal;
        AbstractC0269h.registerDefaultInstance(Modal.class, modal);
    }

    private Modal() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Modal m17256r() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002\u001b\u0003Ȉ\u0004<\u0000", new Object[]{"modalTemplate_", "modalTemplateCase_", BasicModal.class, "buttons_", Button.class, "type_", BaseModal.class});
        }
        if (iOrdinal == 3) {
            return new Modal();
        }
        if (iOrdinal == 4) {
            return new x5f0(25);
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
        synchronized (Modal.class) {
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

    /* JADX INFO: renamed from: o */
    public final BaseModal m17257o() {
        return this.modalTemplateCase_ == 4 ? (BaseModal) this.modalTemplate_ : BaseModal.m17067s();
    }

    /* JADX INFO: renamed from: p */
    public final BasicModal m17258p() {
        return this.modalTemplateCase_ == 1 ? (BasicModal) this.modalTemplate_ : BasicModal.m17106p();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m17259q() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: s */
    public final int m17260s() {
        return rkh0.m75727a(this.modalTemplateCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
