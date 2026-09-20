package com.spotify.spotifyuserprofile.p159v0;

import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CreateNoteResponse extends AbstractC0269h implements sre0 {
    private static final CreateNoteResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NOTE_FIELD_NUMBER = 4;
    public static final int NOTE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USER_FACING_MESSAGE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Note note_;
    private Object result_;
    private int resultCase_ = 0;
    private String userFacingMessage_ = "";

    static {
        CreateNoteResponse createNoteResponse = new CreateNoteResponse();
        DEFAULT_INSTANCE = createNoteResponse;
        AbstractC0269h.registerDefaultInstance(CreateNoteResponse.class, createNoteResponse);
    }

    private CreateNoteResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static CreateNoteResponse m21541s(InputStream inputStream) {
        return (CreateNoteResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003Ȉ\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", ErrorResponse.class, "userFacingMessage_", "note_"});
        }
        if (iOrdinal == 3) {
            return new CreateNoteResponse();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 26);
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
        synchronized (CreateNoteResponse.class) {
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
    public final ErrorResponse m21542n() {
        return this.resultCase_ == 2 ? (ErrorResponse) this.result_ : ErrorResponse.m21556n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Note m21543o() {
        Note note = this.note_;
        return note == null ? Note.m21559p() : note;
    }

    /* JADX INFO: renamed from: p */
    public final String m21544p() {
        return this.resultCase_ == 1 ? (String) this.result_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final String m21545q() {
        return this.userFacingMessage_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21546r() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
