package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TransferProgressResponse extends AbstractC0269h implements sre0 {
    private static final TransferProgressResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    public static final int TRANSFER_PROGRESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String error_ = "";
    private int statusCode_;
    private TransferProgress transferProgress_;

    static {
        TransferProgressResponse transferProgressResponse = new TransferProgressResponse();
        DEFAULT_INSTANCE = transferProgressResponse;
        AbstractC0269h.registerDefaultInstance(TransferProgressResponse.class, transferProgressResponse);
    }

    private TransferProgressResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static TransferProgressResponse m98144p(byte[] bArr) {
        return (TransferProgressResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001c\u0003\u0000\u0000\u0000\u0001ဉ\u0000b\u000bcȈ", new Object[]{"bitField0_", "transferProgress_", "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new TransferProgressResponse();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 29);
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
        synchronized (TransferProgressResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    /* JADX INFO: renamed from: n */
    public final String m98145n() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransferProgress m98146o() {
        TransferProgress transferProgress = this.transferProgress_;
        return transferProgress == null ? TransferProgress.m98137n() : transferProgress;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
