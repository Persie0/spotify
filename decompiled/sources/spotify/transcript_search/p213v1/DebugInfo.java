package spotify.transcript_search.p213v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DebugInfo extends AbstractC0269h implements sre0 {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int FIRST_PLAYBACK_SEGMENT_FIELD_NUMBER = 3;
    public static final int MATCHED_TEXT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String firstPlaybackSegment_ = "";
    private String matchedText_ = "";

    static {
        DebugInfo debugInfo = new DebugInfo();
        DEFAULT_INSTANCE = debugInfo;
        AbstractC0269h.registerDefaultInstance(DebugInfo.class, debugInfo);
    }

    private DebugInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static DebugInfo m98060n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ለ\u0000\u0004ለ\u0001", new Object[]{"bitField0_", "firstPlaybackSegment_", "matchedText_"});
        }
        if (iOrdinal == 3) {
            return new DebugInfo();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 20);
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
        synchronized (DebugInfo.class) {
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
    public final String m98061o() {
        return this.firstPlaybackSegment_;
    }

    /* JADX INFO: renamed from: p */
    public final String m98062p() {
        return this.matchedText_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m98063q() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m98064r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
