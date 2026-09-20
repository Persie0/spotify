package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.akw0;
import p204p.i2z0;
import p204p.j9z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTION_URI_FIELD_NUMBER = 3;
    public static final int CHAT_ENTRY_POINT_FIELD_NUMBER = 6;
    private static final Section DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RENDER_HINT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatEntryPoint chatEntryPoint_;
    private int renderHint_;
    private int type_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String attributionUri_ = "";
    private String description_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    /* JADX INFO: renamed from: p */
    public static Section m20901p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005\f\u0006ဉ\u0000", new Object[]{"bitField0_", "type_", "items_", SectionItem.class, "attributionUri_", "description_", "renderHint_", "chatEntryPoint_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 1);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final String m20902n() {
        return this.attributionUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ChatEntryPoint m20903o() {
        ChatEntryPoint chatEntryPoint = this.chatEntryPoint_;
        return chatEntryPoint == null ? ChatEntryPoint.m20785p() : chatEntryPoint;
    }

    /* JADX INFO: renamed from: q */
    public final akw0 m20904q() {
        akw0 akw0Var;
        int i = this.renderHint_;
        if (i == 0) {
            akw0Var = akw0.UNKNOWN_RENDERING;
        } else if (i != 1) {
            akw0Var = i != 2 ? null : akw0.LIST;
        } else {
            akw0Var = akw0.CAROUSEL;
        }
        return akw0Var == null ? akw0.UNRECOGNIZED : akw0Var;
    }

    /* JADX INFO: renamed from: r */
    public final j9z0 m20905r() {
        j9z0 j9z0Var;
        switch (this.type_) {
            case 0:
                j9z0Var = j9z0.SECTION_TYPE_UNKNOWN;
                break;
            case 1:
                j9z0Var = j9z0.SECTION_TYPE_VIDEO_CAROUSEL;
                break;
            case 2:
                j9z0Var = j9z0.SECTION_TYPE_GENERIC;
                break;
            case 3:
                j9z0Var = j9z0.SECTION_TYPE_DISCOVERY_FEED;
                break;
            case 4:
                j9z0Var = j9z0.SECTION_TYPE_CROSSWORD;
                break;
            case 5:
                j9z0Var = j9z0.SECTION_TYPE_INSTANT_MIX;
                break;
            case 6:
                j9z0Var = j9z0.SECTION_TYPE_DIVIDER;
                break;
            case 7:
                j9z0Var = j9z0.SECTION_TYPE_AGENT;
                break;
            case 8:
                j9z0Var = j9z0.SECTION_TYPE_RELATED_SEARCHES;
                break;
            case 9:
                j9z0Var = j9z0.SECTION_TYPE_CROSS_CONTENT_RELATED;
                break;
            case 10:
                j9z0Var = j9z0.SECTION_TYPE_START_A_CHAT;
                break;
            case 11:
                j9z0Var = j9z0.SECTION_TYPE_TRACK_VERSIONS;
                break;
            case 12:
                j9z0Var = j9z0.SECTION_TYPE_SEARCH_OVERVIEW_PLACEHOLDER;
                break;
            default:
                j9z0Var = null;
                break;
        }
        return j9z0Var == null ? j9z0.UNRECOGNIZED : j9z0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
