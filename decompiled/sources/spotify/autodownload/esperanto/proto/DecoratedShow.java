package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DecoratedShow extends AbstractC0269h implements sre0 {
    public static final int AUTO_DL_ENABLED_FIELD_NUMBER = 7;
    private static final DecoratedShow DEFAULT_INSTANCE;
    public static final int HAS_VIDEO_FIELD_NUMBER = 6;
    public static final int IMG_URI_FIELD_NUMBER = 3;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean autoDlEnabled_;
    private boolean hasVideo_;
    private boolean musicAndTalk_;
    private String uri_ = "";
    private String title_ = "";
    private String imgUri_ = "";
    private String publisher_ = "";

    static {
        DecoratedShow decoratedShow = new DecoratedShow();
        DEFAULT_INSTANCE = decoratedShow;
        AbstractC0269h.registerDefaultInstance(DecoratedShow.class, decoratedShow);
    }

    private DecoratedShow() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\u0007\u0007", new Object[]{"uri_", "title_", "imgUri_", "publisher_", "musicAndTalk_", "hasVideo_", "autoDlEnabled_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedShow();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 28);
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
        synchronized (DecoratedShow.class) {
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

    public final String getPublisher() {
        return this.publisher_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m97402n() {
        return this.autoDlEnabled_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m97403o() {
        return this.hasVideo_;
    }

    /* JADX INFO: renamed from: p */
    public final String m97404p() {
        return this.imgUri_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m97405q() {
        return this.musicAndTalk_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
