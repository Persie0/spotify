package spotify.speechless.p211v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ChatRichMedia extends AbstractC0269h implements sre0 {
    private static final ChatRichMedia DEFAULT_INSTANCE;
    public static final int MEDIA_OBJECT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ae50 mediaObject_ = AbstractC0269h.emptyProtobufList();

    static {
        ChatRichMedia chatRichMedia = new ChatRichMedia();
        DEFAULT_INSTANCE = chatRichMedia;
        AbstractC0269h.registerDefaultInstance(ChatRichMedia.class, chatRichMedia);
    }

    private ChatRichMedia() {
    }

    /* JADX INFO: renamed from: o */
    public static ChatRichMedia m97983o(byte[] bArr) {
        return (ChatRichMedia) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"mediaObject_", MediaObject.class});
        }
        if (iOrdinal == 3) {
            return new ChatRichMedia();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 12);
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
        synchronized (ChatRichMedia.class) {
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
    public final ae50 m97984n() {
        return this.mediaObject_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
