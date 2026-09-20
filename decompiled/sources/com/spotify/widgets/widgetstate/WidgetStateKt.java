package com.spotify.widgets.widgetstate;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m24212d2 = {"DEFAULT_REASON", "", "toBase64String", "Lcom/spotify/widgets/widgetstate/WidgetState;", "toWidgetState", "hasArtwork", "", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WidgetStateKt {
    public static final String DEFAULT_REASON = "user-clicked-widget";

    public static final boolean hasArtwork(WidgetState widgetState) {
        if ((widgetState instanceof WidgetState.ActiveSession) || (widgetState instanceof WidgetState.InactiveSession) || (widgetState instanceof WidgetState.Unauthenticated) || (widgetState instanceof WidgetState.Custom) || (widgetState instanceof WidgetState.WrappedPlaylist) || (widgetState instanceof WidgetState.WrappedStory)) {
            return true;
        }
        if ((widgetState instanceof WidgetState.LoadingState) || (widgetState instanceof WidgetState.TapToReload)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @SuppressLint({"UsingWriteParcelable"})
    public static final String toBase64String(WidgetState widgetState) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeParcelable(widgetState, 0);
            String strEncodeToString = Base64.encodeToString(parcelObtain.marshall(), 2);
            wj50.m88279p(strEncodeToString);
            return strEncodeToString;
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final WidgetState toWidgetState(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                WidgetState widgetState = (WidgetState) parcelObtain.readParcelable(WidgetState.class.getClassLoader());
                parcelObtain.recycle();
                return widgetState;
            } catch (Throwable th) {
                try {
                    Logger.m3967c(th, "Error creating WidgetState from Base64 string", new Object[0]);
                    return null;
                } finally {
                    parcelObtain.recycle();
                }
            }
        } catch (Throwable th2) {
            Logger.m3967c(th2, "Error decoding WidgetState from Base64 string", new Object[0]);
            return null;
        }
    }
}
