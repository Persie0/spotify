package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p204p.lfb1;
import p204p.mfb1;

/* JADX INFO: loaded from: classes3.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(lfb1 lfb1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f775a = lfb1Var.m58855f(iconCompat.f775a, 1);
        byte[] bArr = iconCompat.f777c;
        if (lfb1Var.mo58854e(2)) {
            Parcel parcel = ((mfb1) lfb1Var).f143021e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f777c = bArr;
        iconCompat.f778d = lfb1Var.m58856g(3, iconCompat.f778d);
        iconCompat.f779e = lfb1Var.m58855f(iconCompat.f779e, 4);
        iconCompat.f780f = lfb1Var.m58855f(iconCompat.f780f, 5);
        iconCompat.f781g = (ColorStateList) lfb1Var.m58856g(6, iconCompat.f781g);
        String string = iconCompat.f783i;
        if (lfb1Var.mo58854e(7)) {
            string = ((mfb1) lfb1Var).f143021e.readString();
        }
        iconCompat.f783i = string;
        String string2 = iconCompat.f784j;
        if (lfb1Var.mo58854e(8)) {
            string2 = ((mfb1) lfb1Var).f143021e.readString();
        }
        iconCompat.f784j = string2;
        iconCompat.f782h = PorterDuff.Mode.valueOf(iconCompat.f783i);
        switch (iconCompat.f775a) {
            case -1:
                Parcelable parcelable = iconCompat.f778d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f776b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f778d;
                if (parcelable2 != null) {
                    iconCompat.f776b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f777c;
                iconCompat.f776b = bArr3;
                iconCompat.f775a = 3;
                iconCompat.f779e = 0;
                iconCompat.f780f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f777c, Charset.forName("UTF-16"));
                iconCompat.f776b = str;
                if (iconCompat.f775a == 2 && iconCompat.f784j == null) {
                    iconCompat.f784j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f776b = iconCompat.f777c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, lfb1 lfb1Var) {
        lfb1Var.getClass();
        iconCompat.f783i = iconCompat.f782h.name();
        switch (iconCompat.f775a) {
            case -1:
                iconCompat.f778d = (Parcelable) iconCompat.f776b;
                break;
            case 1:
            case 5:
                iconCompat.f778d = (Parcelable) iconCompat.f776b;
                break;
            case 2:
                iconCompat.f777c = ((String) iconCompat.f776b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f777c = (byte[]) iconCompat.f776b;
                break;
            case 4:
            case 6:
                iconCompat.f777c = iconCompat.f776b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f775a;
        if (-1 != i) {
            lfb1Var.m58859j(i, 1);
        }
        byte[] bArr = iconCompat.f777c;
        if (bArr != null) {
            lfb1Var.mo58858i(2);
            Parcel parcel = ((mfb1) lfb1Var).f143021e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f778d;
        if (parcelable != null) {
            lfb1Var.m58860k(3, parcelable);
        }
        int i2 = iconCompat.f779e;
        if (i2 != 0) {
            lfb1Var.m58859j(i2, 4);
        }
        int i3 = iconCompat.f780f;
        if (i3 != 0) {
            lfb1Var.m58859j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f781g;
        if (colorStateList != null) {
            lfb1Var.m58860k(6, colorStateList);
        }
        String str = iconCompat.f783i;
        if (str != null) {
            lfb1Var.mo58858i(7);
            ((mfb1) lfb1Var).f143021e.writeString(str);
        }
        String str2 = iconCompat.f784j;
        if (str2 != null) {
            lfb1Var.mo58858i(8);
            ((mfb1) lfb1Var).f143021e.writeString(str2);
        }
    }
}
