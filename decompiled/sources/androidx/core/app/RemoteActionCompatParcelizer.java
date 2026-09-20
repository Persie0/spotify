package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p204p.lfb1;
import p204p.mfb1;
import p204p.nfb1;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(lfb1 lfb1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        nfb1 nfb1VarM58857h = remoteActionCompat.f768a;
        boolean z = true;
        if (lfb1Var.mo58854e(1)) {
            nfb1VarM58857h = lfb1Var.m58857h();
        }
        remoteActionCompat.f768a = (IconCompat) nfb1VarM58857h;
        CharSequence charSequence = remoteActionCompat.f769b;
        if (lfb1Var.mo58854e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((mfb1) lfb1Var).f143021e);
        }
        remoteActionCompat.f769b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f770c;
        if (lfb1Var.mo58854e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((mfb1) lfb1Var).f143021e);
        }
        remoteActionCompat.f770c = charSequence2;
        remoteActionCompat.f771d = (PendingIntent) lfb1Var.m58856g(4, remoteActionCompat.f771d);
        boolean z2 = remoteActionCompat.f772e;
        if (lfb1Var.mo58854e(5)) {
            z2 = ((mfb1) lfb1Var).f143021e.readInt() != 0;
        }
        remoteActionCompat.f772e = z2;
        boolean z3 = remoteActionCompat.f773f;
        if (!lfb1Var.mo58854e(6)) {
            z = z3;
        } else if (((mfb1) lfb1Var).f143021e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f773f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, lfb1 lfb1Var) {
        lfb1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f768a;
        lfb1Var.mo58858i(1);
        lfb1Var.m58861l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f769b;
        lfb1Var.mo58858i(2);
        Parcel parcel = ((mfb1) lfb1Var).f143021e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f770c;
        lfb1Var.mo58858i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        lfb1Var.m58860k(4, remoteActionCompat.f771d);
        boolean z = remoteActionCompat.f772e;
        lfb1Var.mo58858i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f773f;
        lfb1Var.mo58858i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
