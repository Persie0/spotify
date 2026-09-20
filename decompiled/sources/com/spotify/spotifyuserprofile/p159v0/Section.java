package com.spotify.spotifyuserprofile.p159v0;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Section DEFAULT_INSTANCE;
    public static final int HINT_TEXT_FIELD_NUMBER = 5;
    public static final int NOTES_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_SUGGESTIONS_FIELD_NUMBER = 6;
    public static final int SECTION_ID_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String title_ = "";
    private ae50 content_ = AbstractC0269h.emptyProtobufList();
    private String sectionId_ = "";
    private ae50 notes_ = AbstractC0269h.emptyProtobufList();
    private String hintText_ = "";
    private ae50 promptSuggestions_ = AbstractC0269h.emptyProtobufList();

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ለ\u0000\u0002\u001b\u0003Ȉ\u0004\u001b\u0005Ȉ\u0006Ț", new Object[]{"bitField0_", "title_", "content_", SectionContent.class, "sectionId_", "notes_", Note.class, "hintText_", "promptSuggestions_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 2);
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
        synchronized (Section.class) {
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

    public final List getContentList() {
        return this.content_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m21565n() {
        return this.hintText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m21566o() {
        return this.notes_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m21567p() {
        return this.promptSuggestions_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21568q() {
        return this.sectionId_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21569r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
