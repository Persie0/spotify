package spotify.ubi;

import com.google.protobuf.AbstractC0269h;
import p204p.dt91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UbiContext$UbiContextProto extends AbstractC0269h implements sre0 {
    public static final int BRANCHING_SOURCE_PAGE_INSTANCE_ID_FIELD_NUMBER = 6;
    private static final UbiContext$UbiContextProto DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 4;
    public static final int NAVIGATION_REASON_ID_FIELD_NUMBER = 7;
    public static final int NAVIGATION_REASON_TYPE_FIELD_NUMBER = 8;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 3;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int VALID_UNTIL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int pagePresentationId_;
    private long validUntil_;
    private int version_;
    private String pageInstanceId_ = "";
    private String interactionId_ = "";
    private String branchingSourcePageInstanceId_ = "";
    private String navigationReasonId_ = "";
    private String navigationReasonType_ = "";

    static {
        UbiContext$UbiContextProto ubiContext$UbiContextProto = new UbiContext$UbiContextProto();
        DEFAULT_INSTANCE = ubiContext$UbiContextProto;
        AbstractC0269h.registerDefaultInstance(UbiContext$UbiContextProto.class, ubiContext$UbiContextProto);
    }

    private UbiContext$UbiContextProto() {
    }

    /* JADX INFO: renamed from: C */
    public static dt91 m98095C() {
        return (dt91) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: D */
    public static UbiContext$UbiContextProto m98096D(byte[] bArr) {
        return (UbiContext$UbiContextProto) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m98097n(UbiContext$UbiContextProto ubiContext$UbiContextProto, String str) {
        ubiContext$UbiContextProto.getClass();
        str.getClass();
        ubiContext$UbiContextProto.bitField0_ |= 2;
        ubiContext$UbiContextProto.branchingSourcePageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m98098o(UbiContext$UbiContextProto ubiContext$UbiContextProto, String str) {
        ubiContext$UbiContextProto.getClass();
        str.getClass();
        ubiContext$UbiContextProto.interactionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m98099p(UbiContext$UbiContextProto ubiContext$UbiContextProto, String str) {
        ubiContext$UbiContextProto.getClass();
        str.getClass();
        ubiContext$UbiContextProto.bitField0_ |= 4;
        ubiContext$UbiContextProto.navigationReasonId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98100q(UbiContext$UbiContextProto ubiContext$UbiContextProto, String str) {
        ubiContext$UbiContextProto.getClass();
        ubiContext$UbiContextProto.navigationReasonType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m98101r(UbiContext$UbiContextProto ubiContext$UbiContextProto, String str) {
        ubiContext$UbiContextProto.getClass();
        str.getClass();
        ubiContext$UbiContextProto.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m98102s(UbiContext$UbiContextProto ubiContext$UbiContextProto, int i) {
        ubiContext$UbiContextProto.bitField0_ |= 1;
        ubiContext$UbiContextProto.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m98103t(UbiContext$UbiContextProto ubiContext$UbiContextProto, long j) {
        ubiContext$UbiContextProto.validUntil_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m98104u(UbiContext$UbiContextProto ubiContext$UbiContextProto) {
        ubiContext$UbiContextProto.version_ = 2;
    }

    /* JADX INFO: renamed from: A */
    public final long m98105A() {
        return this.validUntil_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m98106B() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006ለ\u0001\u0007ለ\u0002\bȈ", new Object[]{"bitField0_", "version_", "validUntil_", "pageInstanceId_", "interactionId_", "pagePresentationId_", "branchingSourcePageInstanceId_", "navigationReasonId_", "navigationReasonType_"});
        }
        if (iOrdinal == 3) {
            return new UbiContext$UbiContextProto();
        }
        if (iOrdinal == 4) {
            return new dt91(DEFAULT_INSTANCE);
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
        synchronized (UbiContext$UbiContextProto.class) {
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

    /* JADX INFO: renamed from: v */
    public final String m98107v() {
        return this.branchingSourcePageInstanceId_;
    }

    /* JADX INFO: renamed from: w */
    public final String m98108w() {
        return this.interactionId_;
    }

    /* JADX INFO: renamed from: x */
    public final String m98109x() {
        return this.navigationReasonId_;
    }

    /* JADX INFO: renamed from: y */
    public final String m98110y() {
        return this.navigationReasonType_;
    }

    /* JADX INFO: renamed from: z */
    public final String m98111z() {
        return this.pageInstanceId_;
    }
}
