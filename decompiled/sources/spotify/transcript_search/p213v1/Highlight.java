package spotify.transcript_search.p213v1;

import com.google.protobuf.AbstractC0269h;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Highlight extends AbstractC0269h implements sre0 {
    private static final Highlight DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_LINE_IDX_FIELD_NUMBER = 1;
    private String highlightedText_ = "";
    private int textLineIdx_;

    static {
        Highlight highlight = new Highlight();
        DEFAULT_INSTANCE = highlight;
        AbstractC0269h.registerDefaultInstance(Highlight.class, highlight);
    }

    private Highlight() {
    }

    /* JADX INFO: renamed from: n */
    public static Highlight m98066n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"textLineIdx_", "highlightedText_"});
        }
        if (iOrdinal == 3) {
            return new Highlight();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 14);
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
        synchronized (Highlight.class) {
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
    public final String m98067o() {
        return this.highlightedText_;
    }

    /* JADX INFO: renamed from: p */
    public final int m98068p() {
        return this.textLineIdx_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
