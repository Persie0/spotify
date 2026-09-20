package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dzv;
import p204p.jas0;
import p204p.nyv;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.sz71;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TimelineEntry extends AbstractC0269h implements sre0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 13;
    public static final int ACTION_FIELD_NUMBER = 14;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 16;
    public static final int BADGE_FIELD_NUMBER = 12;
    private static final TimelineEntry DEFAULT_INSTANCE;
    public static final int ENTRY_FOOTER_ACTION_FIELD_NUMBER = 17;
    public static final int ENTRY_FOOTER_FIELD_NUMBER = 15;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int LEGAL_HTML_FIELD_NUMBER = 18;
    public static final int MEDIA_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 5;
    public static final int PROMINENCE_FIELD_NUMBER = 10;
    public static final int SOURCE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int SUPPORTING_TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TONE_FIELD_NUMBER = 11;
    private TimelineAction action_;
    private PlaceHolderText badge_;
    private int bitField0_;
    private TimelineAction entryFooterAction_;
    private PlaceHolderText entryFooter_;
    private int kind_;
    private EntryMedia media_;
    private PlaceHolderText pretitle_;
    private int prominence_;
    private SourceReference source_;
    private int state_;
    private PlaceHolderText subtitle_;
    private PlaceHolderText supportingText_;
    private PlaceHolderText title_;
    private int tone_;
    private String accentColor_ = "";
    private String backgroundColor_ = "";
    private String legalHtml_ = "";

    static {
        TimelineEntry timelineEntry = new TimelineEntry();
        DEFAULT_INSTANCE = timelineEntry;
        AbstractC0269h.registerDefaultInstance(TimelineEntry.class, timelineEntry);
    }

    private TimelineEntry() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final PlaceHolderText m7159A() {
        PlaceHolderText placeHolderText = this.subtitle_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: B */
    public final PlaceHolderText m7160B() {
        PlaceHolderText placeHolderText = this.supportingText_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: C */
    public final PlaceHolderText m7161C() {
        PlaceHolderText placeHolderText = this.title_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: D */
    public final sz71 m7162D() {
        sz71 sz71Var;
        int i = this.tone_;
        if (i == 0) {
            sz71Var = sz71.TONE_UNSPECIFIED;
        } else if (i == 1) {
            sz71Var = sz71.TONE_NEUTRAL;
        } else if (i == 2) {
            sz71Var = sz71.TONE_ON_SALE;
        } else if (i != 3) {
            sz71Var = i != 4 ? null : sz71.TONE_CRITICAL;
        } else {
            sz71Var = sz71.TONE_WARNING;
        }
        return sz71Var == null ? sz71.UNRECOGNIZED : sz71Var;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7163E() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m7164F() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m7165G() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m7166H() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m7167I() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m7168J() {
        return (this.bitField0_ & 2048) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m7169K() {
        return (this.bitField0_ & 4096) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m7170L() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m7171M() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7172N() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0002\u0012\u0011\u0000\u0000\u0000\u0002\f\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\n\f\u000b\f\fဉ\u0006\rለ\u0007\u000eဉ\b\u000fဉ\t\u0010ለ\n\u0011ဉ\u000b\u0012ለ\f", new Object[]{"bitField0_", "kind_", "state_", "source_", "pretitle_", "title_", "subtitle_", "supportingText_", "media_", "prominence_", "tone_", "badge_", "accentColor_", "action_", "entryFooter_", "backgroundColor_", "entryFooterAction_", "legalHtml_"});
        }
        if (iOrdinal == 3) {
            return new TimelineEntry();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 7);
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
        synchronized (TimelineEntry.class) {
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

    public final boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final String m7173n() {
        return this.accentColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TimelineAction m7174o() {
        TimelineAction timelineAction = this.action_;
        return timelineAction == null ? TimelineAction.m7144o() : timelineAction;
    }

    /* JADX INFO: renamed from: p */
    public final String m7175p() {
        return this.backgroundColor_;
    }

    /* JADX INFO: renamed from: q */
    public final PlaceHolderText m7176q() {
        PlaceHolderText placeHolderText = this.badge_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: r */
    public final PlaceHolderText m7177r() {
        PlaceHolderText placeHolderText = this.entryFooter_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: s */
    public final TimelineAction m7178s() {
        TimelineAction timelineAction = this.entryFooterAction_;
        return timelineAction == null ? TimelineAction.m7144o() : timelineAction;
    }

    /* JADX INFO: renamed from: t */
    public final nyv m7179t() {
        nyv nyvVar;
        int i = this.kind_;
        if (i == 0) {
            nyvVar = nyv.ENTRY_KIND_UNSPECIFIED;
        } else if (i == 1) {
            nyvVar = nyv.ENTRY_KIND_RESERVATION;
        } else if (i == 2) {
            nyvVar = nyv.ENTRY_KIND_PRESALE;
        } else if (i != 3) {
            nyvVar = i != 4 ? null : nyv.ENTRY_KIND_MILESTONE;
        } else {
            nyvVar = nyv.ENTRY_KIND_GENERAL_SALE;
        }
        return nyvVar == null ? nyv.UNRECOGNIZED : nyvVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m7180u() {
        return this.legalHtml_;
    }

    /* JADX INFO: renamed from: v */
    public final EntryMedia m7181v() {
        EntryMedia entryMedia = this.media_;
        return entryMedia == null ? EntryMedia.m7033n() : entryMedia;
    }

    /* JADX INFO: renamed from: w */
    public final PlaceHolderText m7182w() {
        PlaceHolderText placeHolderText = this.pretitle_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: x */
    public final jas0 m7183x() {
        jas0 jas0Var;
        int i = this.prominence_;
        if (i == 0) {
            jas0Var = jas0.PROMINENCE_UNSPECIFIED;
        } else if (i == 1) {
            jas0Var = jas0.PROMINENCE_DEFAULT;
        } else if (i != 2) {
            jas0Var = i != 3 ? null : jas0.PROMINENCE_SUBDUED;
        } else {
            jas0Var = jas0.PROMINENCE_HIGHLIGHTED;
        }
        return jas0Var == null ? jas0.UNRECOGNIZED : jas0Var;
    }

    /* JADX INFO: renamed from: y */
    public final SourceReference m7184y() {
        SourceReference sourceReference = this.source_;
        return sourceReference == null ? SourceReference.m7124p() : sourceReference;
    }

    /* JADX INFO: renamed from: z */
    public final dzv m7185z() {
        dzv dzvVar;
        switch (this.state_) {
            case 0:
                dzvVar = dzv.ENTRY_STATE_UNSPECIFIED;
                break;
            case 1:
                dzvVar = dzv.ENTRY_STATE_UPCOMING;
                break;
            case 2:
                dzvVar = dzv.ENTRY_STATE_ACTIVE;
                break;
            case 3:
                dzvVar = dzv.ENTRY_STATE_ENDED;
                break;
            case 4:
                dzvVar = dzv.ENTRY_STATE_SOLD_OUT;
                break;
            case 5:
                dzvVar = dzv.ENTRY_STATE_CANCELLED;
                break;
            case 6:
                dzvVar = dzv.ENTRY_STATE_PURCHASED;
                break;
            default:
                dzvVar = null;
                break;
        }
        return dzvVar == null ? dzv.UNRECOGNIZED : dzvVar;
    }
}
