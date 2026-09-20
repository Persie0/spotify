package com.spotify.encoremobile.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gtq;
import p204p.o20;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00068\u0010X\u0090D¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/encoremobile/buttons/PrimaryButtonView;", "Lp/o20;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "i", "I", "getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "()I", "btnTintList", "t", "getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons", "actionButtonBackground", "L0", "getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons", "textColorAttr", "M0", "getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons", "textTintList", "src_main_java_com_spotify_encoremobile_buttons-buttons"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PrimaryButtonView extends o20 {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public final int textColorAttr;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public final int textTintList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int btnTintList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int actionButtonBackground;

    public PrimaryButtonView(Context context) {
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

    public PrimaryButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PrimaryButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public PrimaryButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.btnTintList = R.color.encore_primary_button;
        this.actionButtonBackground = R.drawable.action_button_background;
        this.textColorAttr = R.attr.textBase;
        this.textTintList = -1;
        m66091j();
    }

    public /* synthetic */ PrimaryButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? R.style.ActionButton_Large : i2);
    }
}
