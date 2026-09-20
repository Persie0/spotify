package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class vzq0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246528a;

    public /* synthetic */ vzq0(int i) {
        this.f246528a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f246528a) {
            case 0:
                return new wzq0(parcel.readInt() != 0);
            case 1:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("OPAQUE")) {
                    i = 1;
                } else if (string.equals("TRANSPARENT")) {
                    i = 2;
                } else {
                    if (!string.equals("FADE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.navigation.presentation.PresentationMode.Overlay.Default.Background.".concat(string));
                    }
                    i = 3;
                }
                return new xzq0(i, parcel.readInt() != 0, (nz4) parcel.readParcelable(xzq0.class.getClassLoader()));
            case 2:
                return new d0r0((pte0) parcel.readParcelable(d0r0.class.getClassLoader()), ase0.CREATOR.createFromParcel(parcel), (gh00) parcel.readSerializable());
            case 3:
                return new i0r0(v1r0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : kzc1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ubw.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d2z.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : nk00.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : fg60.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f4b0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : tbw.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : tbw.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : o1z.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : o1z.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : mk00.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : mk00.CREATOR.createFromParcel(parcel));
            case 4:
                parcel.readInt();
                return d1r0.f44340a;
            case 5:
                return new r1r0(parcel.readString());
            case 6:
                parcel.readInt();
                return d2r0.f44665a;
            case 7:
                parcel.readInt();
                return e2r0.f55505a;
            case 8:
                parcel.readInt();
                return f2r0.f65259a;
            case 9:
                return new g2r0(v1r0.valueOf(parcel.readString()));
            case 10:
                return new u3r0(parcel.readLong(), (pla1) parcel.readParcelable(u3r0.class.getClassLoader()), (hdj) parcel.readParcelable(u3r0.class.getClassLoader()));
            case 11:
                return new e4r0(parcel.readString(), parcel.readString());
            case 12:
                return new w3r0(parcel.readLong(), (pla1) parcel.readParcelable(w3r0.class.getClassLoader()));
            case 13:
                return new x3r0(parcel.readLong(), (pla1) parcel.readParcelable(x3r0.class.getClassLoader()), parcel.readString());
            case 14:
                long j = parcel.readLong();
                pla1 pla1Var = (pla1) parcel.readParcelable(y3r0.class.getClassLoader());
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("Reported")) {
                    i2 = 1;
                } else {
                    if (!string2.equals("Removed")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.utils.formatters.preview.Preview.Moderated.Type.".concat(string2));
                    }
                    i2 = 2;
                }
                return new y3r0(j, pla1Var, i2);
            case 15:
                return new z3r0(parcel.readLong(), (pla1) parcel.readParcelable(z3r0.class.getClassLoader()));
            case 16:
                return new a4r0(parcel.readLong(), (pla1) parcel.readParcelable(a4r0.class.getClassLoader()), parcel.readString());
            case 17:
                return new b4r0(parcel.readLong(), (pla1) parcel.readParcelable(b4r0.class.getClassLoader()), (pdj) parcel.readParcelable(b4r0.class.getClassLoader()));
            case 18:
                return new c4r0(parcel.readLong(), (pla1) parcel.readParcelable(c4r0.class.getClassLoader()), parcel.readString(), (vdj) parcel.readParcelable(c4r0.class.getClassLoader()), (lv01) parcel.readParcelable(c4r0.class.getClassLoader()));
            case 19:
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                int iM64020m = 0;
                while (iM64020m != i4) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new x9r0(string3, parcel.readString(), parcel.readString(), parcel.readString(), linkedHashSet);
            case 20:
                return new fcr0(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 21:
                return new gcr0(parcel.readString(), parcel.readString());
            case 22:
                String string4 = parcel.readString();
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("LANDSCAPE")) {
                    i3 = 1;
                } else {
                    if (!string5.equals("PORTRAIT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.share.models.PreviewShareMedia.Video.VideoOrientation.".concat(string5));
                    }
                    i3 = 2;
                }
                return new hcr0(string4, j2, j3, z, z2, i3, parcel.readString());
            case 23:
                return new wfr0(parcel.readInt() != 0);
            case 24:
                return agr0.valueOf(parcel.readString());
            case 25:
                parcel.readInt();
                return zgr0.f282699a;
            case 26:
                return new ahr0(parcel.readString());
            case 27:
                parcel.readInt();
                return bhr0.f27231a;
            case 28:
                parcel.readInt();
                return chr0.f38071a;
            default:
                return new tir0(parcel.createStringArrayList());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f246528a) {
            case 0:
                return new wzq0[i];
            case 1:
                return new xzq0[i];
            case 2:
                return new d0r0[i];
            case 3:
                return new i0r0[i];
            case 4:
                return new d1r0[i];
            case 5:
                return new r1r0[i];
            case 6:
                return new d2r0[i];
            case 7:
                return new e2r0[i];
            case 8:
                return new f2r0[i];
            case 9:
                return new g2r0[i];
            case 10:
                return new u3r0[i];
            case 11:
                return new e4r0[i];
            case 12:
                return new w3r0[i];
            case 13:
                return new x3r0[i];
            case 14:
                return new y3r0[i];
            case 15:
                return new z3r0[i];
            case 16:
                return new a4r0[i];
            case 17:
                return new b4r0[i];
            case 18:
                return new c4r0[i];
            case 19:
                return new x9r0[i];
            case 20:
                return new fcr0[i];
            case 21:
                return new gcr0[i];
            case 22:
                return new hcr0[i];
            case 23:
                return new wfr0[i];
            case 24:
                return new agr0[i];
            case 25:
                return new zgr0[i];
            case 26:
                return new ahr0[i];
            case 27:
                return new bhr0[i];
            case 28:
                return new chr0[i];
            default:
                return new tir0[i];
        }
    }
}
