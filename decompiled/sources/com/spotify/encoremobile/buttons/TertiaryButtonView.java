package com.spotify.encoremobile.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.e071;
import p204p.gtq;
import p204p.lzj;
import p204p.o20;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00068\u0010X\u0090D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00068\u0010X\u0090D¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/encoremobile/buttons/TertiaryButtonView;", "Lp/o20;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/e071;", "textColor", "Lp/w2a1;", "setTextColor", "(Lp/e071;)V", "i", "I", "getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "()I", "btnTintList", "t", "getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons", "actionButtonBackground", "L0", "getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons", "textColorAttr", "M0", "getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "textTintList", "src_main_java_com_spotify_encoremobile_buttons-buttons"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TertiaryButtonView extends o20 {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public final int textColorAttr;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public final int textTintList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int btnTintList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int actionButtonBackground;

    public TertiaryButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // p204p.o20
    /* JADX INFO: renamed from: getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getActionButtonBackground() {
        return this.actionButtonBackground;
    }

    @Override // p204p.o20
    /* JADX INFO: renamed from: getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getBtnTintList() {
        return this.btnTintList;
    }

    @Override // p204p.o20
    /* JADX INFO: renamed from: getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getTextColorAttr() {
        return this.textColorAttr;
    }

    @Override // p204p.o20
    /* JADX INFO: renamed from: getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons, reason: from getter */
    public int getTextTintList() {
        return this.textTintList;
    }

    public final void setTextColor(e071 textColor) {
        int textTintList;
        Context context = getContext();
        int iOrdinal = textColor.ordinal();
        if (iOrdinal != 1) {
            textTintList = iOrdinal != 2 ? getTextTintList() : R.color.encore_tertiary_button_black;
        } else {
            textTintList = R.color.encore_tertiary_button_white;
        }
        setTextColor(lzj.m60387w(context, textTintList));
    }

    public TertiaryButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TertiaryButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TertiaryButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.btnTintList = -1;
        this.actionButtonBackground = R.drawable.tertiary_button_background;
        this.textColorAttr = -1;
        this.textTintList = R.color.encore_tertiary_button_green;
        m66091j();
    }

    public /* synthetic */ TertiaryButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? R.style.ActionButton_Large : i2);
    }
}
