package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e3o0;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PinResponse extends AbstractC0269h implements sre0 {
    private static final PinResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HAS_MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 2;
    public static final int MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String error_ = "";
    private boolean hasMaximumPinnedItems_;
    private int maximumPinnedItems_;
    private int statusCode_;
    private int status_;

    static {
        PinResponse pinResponse = new PinResponse();
        DEFAULT_INSTANCE = pinResponse;
        AbstractC0269h.registerDefaultInstance(PinResponse.class, pinResponse);
    }

    private PinResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PinResponse m98133q(byte[] bArr) {
        return (PinResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001c\u0005\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0004b\u000bcȈ", new Object[]{"status_", "hasMaximumPinnedItems_", "maximumPinnedItems_", "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new PinResponse();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 13);
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
        synchronized (PinResponse.class) {
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
    public final boolean m98134n() {
        return this.hasMaximumPinnedItems_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m98135o() {
        return this.maximumPinnedItems_;
    }

    /* JADX INFO: renamed from: p */
    public final e3o0 m98136p() {
        e3o0 e3o0Var;
        int i = this.status_;
        if (i == 0) {
            e3o0Var = e3o0.UNKNOWN;
        } else if (i != 1) {
            e3o0Var = i != 2 ? null : e3o0.NOT_PINNED;
        } else {
            e3o0Var = e3o0.PINNED;
        }
        return e3o0Var == null ? e3o0.UNRECOGNIZED : e3o0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
