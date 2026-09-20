package com.spotify.spotifyuserprofile.p159v0;

import com.google.protobuf.AbstractC0269h;
import p204p.EnumC2288qc;
import p204p.bpj0;
import p204p.lir0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Note extends AbstractC0269h implements sre0 {
    public static final int ACCEPTANCE_STATUS_FIELD_NUMBER = 6;
    public static final int CONTENT_FIELD_NUMBER = 2;
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    private static final Note DEFAULT_INSTANCE;
    public static final int NOTE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PROCESSING_STATUS_FIELD_NUMBER = 5;
    public static final int UPDATED_AT_FIELD_NUMBER = 4;
    private int acceptanceStatus_;
    private long createdAt_;
    private int processingStatus_;
    private long updatedAt_;
    private String noteId_ = "";
    private String content_ = "";

    static {
        Note note = new Note();
        DEFAULT_INSTANCE = note;
        AbstractC0269h.registerDefaultInstance(Note.class, note);
    }

    private Note() {
    }

    /* JADX INFO: renamed from: p */
    public static Note m21559p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\f\u0006\f", new Object[]{"noteId_", "content_", "createdAt_", "updatedAt_", "processingStatus_", "acceptanceStatus_"});
        }
        if (iOrdinal == 3) {
            return new Note();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 4);
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
        synchronized (Note.class) {
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

    /* JADX INFO: renamed from: n */
    public final EnumC2288qc m21560n() {
        EnumC2288qc enumC2288qc;
        int i = this.acceptanceStatus_;
        if (i == 0) {
            enumC2288qc = EnumC2288qc.NOTE_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            enumC2288qc = i != 2 ? null : EnumC2288qc.PARTIALLY_ACCEPTED;
        } else {
            enumC2288qc = EnumC2288qc.ACCEPTED;
        }
        return enumC2288qc == null ? EnumC2288qc.UNRECOGNIZED : enumC2288qc;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21561o() {
        return this.content_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21562q() {
        return this.noteId_;
    }

    /* JADX INFO: renamed from: r */
    public final lir0 m21563r() {
        lir0 lir0Var;
        int i = this.processingStatus_;
        if (i == 0) {
            lir0Var = lir0.PROCESSING_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            lir0Var = i != 2 ? null : lir0.PROCESSING;
        } else {
            lir0Var = lir0.INCORPORATED;
        }
        return lir0Var == null ? lir0.UNRECOGNIZED : lir0Var;
    }

    /* JADX INFO: renamed from: s */
    public final long m21564s() {
        return this.updatedAt_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
