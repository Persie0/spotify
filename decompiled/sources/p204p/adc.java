package p204p;

import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard$Events;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class adc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f14599a;

    static {
        int[] iArr = new int[PermissionsCard$Events.values().length];
        try {
            iArr[PermissionsCard$Events.ButtonTapped.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f14599a = iArr;
    }
}
