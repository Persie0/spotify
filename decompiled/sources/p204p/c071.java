package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserListeningStatus;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class c071 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32702a;

    public /* synthetic */ c071(int i) {
        this.f32702a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f32702a) {
            case 0:
                parcel.readInt();
                return new d071();
            case 1:
                parcel.readInt();
                return d471.f45099a;
            case 2:
                return new e471(parcel.readString());
            case 3:
                parcel.readInt();
                return f471.f65690a;
            case 4:
                return new i471((sr01) parcel.readParcelable(i471.class.getClassLoader()), stz0.m79365s(parcel.readString()), (g471) parcel.readParcelable(i471.class.getClassLoader()), parcel.readString(), ((nu71) parcel.readParcelable(i471.class.getClassLoader())).f158526a, (bf71) parcel.readParcelable(i471.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(i471.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(i471.class.getClassLoader()), null, parcel.readString());
            case 5:
                return new l471(((nu71) parcel.readParcelable(l471.class.getClassLoader())).f158526a, (bf71) parcel.readParcelable(l471.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), (gcr0) parcel.readParcelable(l471.class.getClassLoader()), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(l471.class.getClassLoader()), parcel.readString());
            case 6:
                return new hc71(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 7:
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(as20.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new jd71(j, j2, string, string2, arrayList);
            case 8:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("Word")) {
                    i = 1;
                } else if (string5.equals("Sentenced")) {
                    i = 2;
                } else {
                    if (!string5.equals("Static")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.transcript.listimpl.element.textsentence.TextSentenceElement.SyncStatus.".concat(string5));
                    }
                    i = 3;
                }
                return new oe71(string3, string4, i3, z, i, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
            case 9:
                int i4 = parcel.readInt();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(hc71.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new te71(string6, i4, arrayList2);
            case 10:
                return new ze71(parcel.readString());
            case 11:
                return new af71((nu71) parcel.readParcelable(af71.class.getClassLoader()));
            case 12:
                return new cl71(parcel.readString(), parcel.readString());
            case 13:
                return new jl71(parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return pl71.f178659a;
            case 15:
                return new fm71(parcel.readInt() != 0, parcel.readString());
            case 16:
                return new pp71(parcel.readInt(), (kp71) parcel.readParcelable(pp71.class.getClassLoader()), (qro0) parcel.readParcelable(pp71.class.getClassLoader()));
            case 17:
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iM31715d3 = 0;
                while (iM31715d3 != i6) {
                    iM31715d3 = c7h0.m31715d(fm71.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new dp71(arrayList3);
            case 18:
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iM31715d4 = 0;
                while (iM31715d4 != i7) {
                    iM31715d4 = c7h0.m31715d(tr71.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                return new ep71(arrayList4);
            case 19:
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                int iM31715d5 = 0;
                while (iM31715d5 != i8) {
                    iM31715d5 = c7h0.m31715d(tr71.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                return new fp71(arrayList5, (mq71) parcel.readParcelable(fp71.class.getClassLoader()), parcel.readInt());
            case 20:
                parcel.readInt();
                return gp71.f83100a;
            case 21:
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int iM31715d6 = 0;
                while (iM31715d6 != i9) {
                    iM31715d6 = c7h0.m31715d(tr71.CREATOR, parcel, arrayList6, iM31715d6, 1);
                }
                return new hp71(parcel.readInt(), arrayList6);
            case 22:
                int i10 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i10);
                int iM31715d7 = 0;
                while (iM31715d7 != i10) {
                    iM31715d7 = c7h0.m31715d(tr71.CREATOR, parcel, arrayList7, iM31715d7, 1);
                }
                return new ip71(parcel.readInt(), arrayList7);
            case 23:
                return new jp71(UserListeningStatus.m11480q(parcel.createByteArray()));
            case 24:
                int i11 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i11);
                int iM9h = 0;
                while (iM9h != i11) {
                    iM9h = AbstractC0000a.m9h(lp71.class, parcel, arrayList8, iM9h, 1);
                }
                return new lp71(arrayList8);
            case 25:
                parcel.readInt();
                return kq71.f125230a;
            case 26:
                parcel.readInt();
                return lq71.f135969a;
            case 27:
                return new cr71(parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new dr71(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            default:
                return new er71(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f32702a) {
            case 0:
                return new d071[i];
            case 1:
                return new d471[i];
            case 2:
                return new e471[i];
            case 3:
                return new f471[i];
            case 4:
                return new i471[i];
            case 5:
                return new l471[i];
            case 6:
                return new hc71[i];
            case 7:
                return new jd71[i];
            case 8:
                return new oe71[i];
            case 9:
                return new te71[i];
            case 10:
                return new ze71[i];
            case 11:
                return new af71[i];
            case 12:
                return new cl71[i];
            case 13:
                return new jl71[i];
            case 14:
                return new pl71[i];
            case 15:
                return new fm71[i];
            case 16:
                return new pp71[i];
            case 17:
                return new dp71[i];
            case 18:
                return new ep71[i];
            case 19:
                return new fp71[i];
            case 20:
                return new gp71[i];
            case 21:
                return new hp71[i];
            case 22:
                return new ip71[i];
            case 23:
                return new jp71[i];
            case 24:
                return new lp71[i];
            case 25:
                return new kq71[i];
            case 26:
                return new lq71[i];
            case 27:
                return new cr71[i];
            case 28:
                return new dr71[i];
            default:
                return new er71[i];
        }
    }
}
