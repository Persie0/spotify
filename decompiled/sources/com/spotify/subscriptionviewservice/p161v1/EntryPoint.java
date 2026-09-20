package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.czv;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EntryPoint extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    private static final EntryPoint DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISCLAIMER_FIELD_NUMBER = 10;
    public static final int DISCLAIMER_ICON_FIELD_NUMBER = 11;
    public static final int LAYOUT_FIELD_NUMBER = 9;
    public static final int LEADING_ICON_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_COLORS_FIELD_NUMBER = 6;
    public static final int PROGRESS_PERCENTAGE_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRAILING_ICON_FIELD_NUMBER = 8;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private Icon disclaimerIcon_;
    private int layout_;
    private Icon leadingIcon_;
    private Colors progressColors_;
    private float progressPercentage_;
    private Icon trailingIcon_;
    private String title_ = "";
    private String description_ = "";
    private String uri_ = "";
    private String accessibilityText_ = "";
    private String disclaimer_ = "";
    private String ubiId_ = "";

    static {
        EntryPoint entryPoint = new EntryPoint();
        DEFAULT_INSTANCE = entryPoint;
        AbstractC0269h.registerDefaultInstance(EntryPoint.class, entryPoint);
    }

    private EntryPoint() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001d\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0001\u0006ဉ\u0002\u0007ခ\u0003\bဉ\u0004\t\f\nለ\u0005\u000bဉ\u0006dለ\u0007", new Object[]{"bitField0_", "leadingIcon_", "title_", "description_", "uri_", "accessibilityText_", "progressColors_", "progressPercentage_", "trailingIcon_", "layout_", "disclaimer_", "disclaimerIcon_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new EntryPoint();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 10);
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
        synchronized (EntryPoint.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final czv m21734n() {
        czv czvVar;
        switch (this.layout_) {
            case 0:
                czvVar = czv.ENTRY_POINT_LAYOUT_UNSPECIFIED;
                break;
            case 1:
                czvVar = czv.ENTRY_POINT_LAYOUT_BUTTON_PRIMARY;
                break;
            case 2:
                czvVar = czv.ENTRY_POINT_LAYOUT_BUTTON_SECONDARY;
                break;
            case 3:
                czvVar = czv.ENTRY_POINT_LAYOUT_BUTTON_TERTIARY;
                break;
            case 4:
                czvVar = czv.ENTRY_POINT_LAYOUT_CARD_STANDARD;
                break;
            case 5:
                czvVar = czv.ENTRY_POINT_LAYOUT_CARD_PROGRESS;
                break;
            case 6:
                czvVar = czv.ENTRY_POINT_LAYOUT_CARD_EDIT;
                break;
            default:
                czvVar = null;
                break;
        }
        return czvVar == null ? czv.UNRECOGNIZED : czvVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Icon m21735o() {
        Icon icon = this.leadingIcon_;
        return icon == null ? Icon.m21752o() : icon;
    }

    /* JADX INFO: renamed from: p */
    public final float m21736p() {
        return this.progressPercentage_;
    }

    /* JADX INFO: renamed from: q */
    public final Icon m21737q() {
        Icon icon = this.trailingIcon_;
        return icon == null ? Icon.m21752o() : icon;
    }

    /* JADX INFO: renamed from: r */
    public final String m21738r() {
        return this.ubiId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
