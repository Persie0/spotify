package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class igo0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102026a;

    public /* synthetic */ igo0(int i) {
        this.f102026a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f102026a) {
            case 0:
                parcel.readInt();
                return jgo0.f112231a;
            case 1:
                return new kgo0(parcel.readInt() != 0);
            case 2:
                return new lgo0(parcel.readInt() != 0);
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                i8b0 i8b0Var = (i8b0) parcel.readParcelable(zno0.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                int iM9h = 0;
                while (iM9h != i6) {
                    iM9h = AbstractC0000a.m9h(zno0.class, parcel, arrayList, iM9h, 1);
                }
                tro0 tro0Var = (tro0) parcel.readParcelable(zno0.class.getClassLoader());
                zwt0 zwt0Var = (zwt0) parcel.readParcelable(zno0.class.getClassLoader());
                int i7 = parcel.readInt();
                int iM9h2 = 0;
                ArrayList arrayList2 = new ArrayList(i7);
                while (iM9h2 != i7) {
                    iM9h2 = AbstractC0000a.m9h(zno0.class, parcel, arrayList2, iM9h2, 1);
                }
                return new zno0(string, string2, i4, i5, i8b0Var, arrayList, tro0Var, zwt0Var, arrayList2);
            case 4:
                return ppo0.valueOf(parcel.readString());
            case 5:
                return new zqo0((caa0) parcel.readParcelable(zqo0.class.getClassLoader()));
            case 6:
                parcel.readInt();
                return aro0.f19114a;
            case 7:
                parcel.readInt();
                return bro0.f30124a;
            case 8:
                parcel.readInt();
                return cro0.f41336a;
            case 9:
                parcel.readInt();
                return hro0.f94505a;
            case 10:
                return new iro0(parcel.readString());
            case 11:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("NONE")) {
                    i = 1;
                } else if (string5.equals("PLAYING")) {
                    i = 2;
                } else {
                    if (!string5.equals("PAUSED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.mobius.model.PlayState.PlayerState.".concat(string5));
                    }
                    i = 3;
                }
                return new jro0(string3, string4, i);
            case 12:
                parcel.readInt();
                return mro0.f146586a;
            case 13:
                return new nro0((xkx0) parcel.readParcelable(nro0.class.getClassLoader()));
            case 14:
                return new kro0(parcel.readString());
            case 15:
                return new avo0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new xzo0(parcel.readString());
            case 17:
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("StartSlow")) {
                    i2 = 1;
                } else {
                    if (!string6.equals("Stuck")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.offline.playbacktimeoutpage.PlaybackTimeoutReason.".concat(string6));
                    }
                    i2 = 2;
                }
                return new l5p0(i2);
            case 18:
                parcel.readInt();
                return nap0.f152107a;
            case 19:
                parcel.readInt();
                return cbp0.f36172a;
            case 20:
                return new gbp0(parcel.readLong(), parcel.readLong());
            case 21:
                parcel.readInt();
                return hbp0.f89568a;
            case 22:
                parcel.readInt();
                return cep0.f37165a;
            case 23:
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new dep0(z, parcel.readInt() != 0, parcel.readInt(), parcel.readLong(), parcel.createStringArrayList(), parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            case 24:
                return new wep0(parcel.readString(), (oi3) parcel.readParcelable(wep0.class.getClassLoader()));
            case 25:
                return new ggp0(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, mrx0.m62668v(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 26:
                return new sip0(parcel.readString(), parcel.readString(), lnn0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 27:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                String string9 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("UNKNOWN")) {
                    i3 = 1;
                } else if (string10.equals(SearchEndpointResponseKt.RESULT_SUCCESS)) {
                    i3 = 2;
                } else if (string10.equals("QUEUED")) {
                    i3 = 3;
                } else if (string10.equals("PROCESSING")) {
                    i3 = 4;
                } else {
                    if (!string10.equals(SearchEndpointResponseKt.RESULT_ERROR)) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.resources.PromptGenerationStatus.".concat(string10));
                    }
                    i3 = 5;
                }
                return new ckp0(string7, string8, z2, z3, string9, z4, i3, parcel.readInt() != 0);
            case 28:
                return new ump0((cqj0) parcel.readParcelable(ump0.class.getClassLoader()), (waz0) parcel.readParcelable(ump0.class.getClassLoader()), parcel.readInt() != 0, (mr20) parcel.readParcelable(ump0.class.getClassLoader()));
            default:
                return new wmp0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f102026a) {
            case 0:
                return new jgo0[i];
            case 1:
                return new kgo0[i];
            case 2:
                return new lgo0[i];
            case 3:
                return new zno0[i];
            case 4:
                return new ppo0[i];
            case 5:
                return new zqo0[i];
            case 6:
                return new aro0[i];
            case 7:
                return new bro0[i];
            case 8:
                return new cro0[i];
            case 9:
                return new hro0[i];
            case 10:
                return new iro0[i];
            case 11:
                return new jro0[i];
            case 12:
                return new mro0[i];
            case 13:
                return new nro0[i];
            case 14:
                return new kro0[i];
            case 15:
                return new avo0[i];
            case 16:
                return new xzo0[i];
            case 17:
                return new l5p0[i];
            case 18:
                return new nap0[i];
            case 19:
                return new cbp0[i];
            case 20:
                return new gbp0[i];
            case 21:
                return new hbp0[i];
            case 22:
                return new cep0[i];
            case 23:
                return new dep0[i];
            case 24:
                return new wep0[i];
            case 25:
                return new ggp0[i];
            case 26:
                return new sip0[i];
            case 27:
                return new ckp0[i];
            case 28:
                return new ump0[i];
            default:
                return new wmp0[i];
        }
    }
}
