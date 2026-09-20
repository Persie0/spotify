package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.wrapped.p194v1.proto.ConsumerShareRequestParameters;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class xed1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260695a;

    public /* synthetic */ xed1(int i) {
        this.f260695a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        aix0 xhx0Var;
        ConsumerShareRequestParameters consumerShareRequestParametersM23144n;
        switch (this.f260695a) {
            case 0:
                parcel.readInt();
                return yed1.f271976a;
            case 1:
                return new ggd1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new mgd1(string, string2, string3, z2, z, parcel.readInt() != 0);
            case 3:
                parcel.readInt();
                return new lkd1();
            case 4:
                return new vmd1(parcel);
            case 5:
                return new rod1((MessageResponseToken) parcel.readParcelable(rod1.class.getClassLoader()), wco.CREATOR.createFromParcel(parcel), (d850) parcel.readParcelable(rod1.class.getClassLoader()));
            case 6:
                String string4 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iM75732f = 0;
                while (iM75732f != i) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new xod1(string4, linkedHashMap);
            case 7:
                return new iqd1(parcel.readString(), (cbm0) parcel.readSerializable(), (voc1) parcel.readParcelable(iqd1.class.getClassLoader()));
            case 8:
                return new u0e1(parcel.readString());
            case 9:
                return new d9e1(parcel.readString(), parcel.readString());
            case 10:
                return new bbe1(parcel.readString());
            case 11:
                parcel.readInt();
                return tce1.f219079a;
            case 12:
                return new wde1(parcel.readString());
            case 13:
                String string5 = parcel.readString();
                b450 b450VarM63417Y = n0e1.m63417Y(0, parcel.readInt());
                ArrayList arrayList = new ArrayList();
                Iterator it = b450VarM63417Y.iterator();
                while (((a450) it).f12141c) {
                    ((t350) it).nextInt();
                    int i2 = parcel.readInt();
                    String string6 = parcel.readString();
                    if (string6 == null) {
                        throw new IllegalStateException("path is null in parcel");
                    }
                    switch (i2) {
                        case 0:
                            xhx0Var = new xhx0(string6, parcel.readFloat());
                            break;
                        case 1:
                            xhx0Var = new thx0(string6, parcel.readInt() != 0);
                            break;
                        case 2:
                            String string7 = parcel.readString();
                            if (string7 == null) {
                                throw new IllegalStateException("string value is null in parcel");
                            }
                            xhx0Var = new yhx0(string6, string7);
                            break;
                            break;
                        case 3:
                            xhx0Var = new uhx0(string6, parcel.readInt());
                            break;
                        case 4:
                            String string8 = parcel.readString();
                            if (string8 == null) {
                                throw new IllegalStateException("enum value is null in parcel");
                            }
                            xhx0Var = new vhx0(string6, string8);
                            break;
                            break;
                        case 5:
                            xhx0Var = new zhx0(string6);
                            break;
                        case 6:
                            String string9 = parcel.readString();
                            if (string9 == null) {
                                throw new IllegalStateException("image file path is null in parcel");
                            }
                            xhx0Var = new whx0(string6, pxy.m71563W(new File(string9)));
                            break;
                            break;
                        default:
                            xhx0Var = null;
                            break;
                    }
                    if (xhx0Var != null) {
                        arrayList.add(xhx0Var);
                    }
                }
                return new xde1(string5, parcel.createStringArrayList(), arrayList);
            case 14:
                return new zde1(parcel.readString(), parcel.readInt() != 0);
            case 15:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                int iM75732f2 = 0;
                while (iM75732f2 != i3) {
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f2, 1);
                }
                return new cee1(string10, string11, linkedHashMap2);
            case 16:
                return new dee1(parcel.readString(), cee1.CREATOR.createFromParcel(parcel), parcel.readString(), zde1.CREATOR.createFromParcel(parcel), (yde1) parcel.readParcelable(dee1.class.getClassLoader()));
            case 17:
                return new hee1(parcel.readInt(), (xr01) parcel.readParcelable(hee1.class.getClassLoader()), (ou31) parcel.readParcelable(hee1.class.getClassLoader()), dee1.CREATOR.createFromParcel(parcel));
            case 18:
                parcel.readInt();
                return nee1.f152980a;
            case 19:
                String string12 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(ree1.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new qee1(parcel.readInt(), string12, arrayList2);
            case 20:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    consumerShareRequestParametersM23144n = null;
                } else {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    consumerShareRequestParametersM23144n = ConsumerShareRequestParameters.m23144n(bArr);
                }
                return new ree1(string13, string14, consumerShareRequestParametersM23144n);
            case 21:
                return new lje1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 22:
                return new mje1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 23:
                return new nje1(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 24:
                return new oje1(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 25:
                return new pje1(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 26:
                parcel.readInt();
                return rje1.f199800a;
            case 27:
                parcel.readInt();
                return sje1.f209829a;
            case 28:
                return new rne1(parcel.readString());
            default:
                return new sne1(parcel.createStringArrayList(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f260695a) {
            case 0:
                return new yed1[i];
            case 1:
                return new ggd1[i];
            case 2:
                return new mgd1[i];
            case 3:
                return new lkd1[i];
            case 4:
                return new vmd1[i];
            case 5:
                return new rod1[i];
            case 6:
                return new xod1[i];
            case 7:
                return new iqd1[i];
            case 8:
                return new u0e1[i];
            case 9:
                return new d9e1[i];
            case 10:
                return new bbe1[i];
            case 11:
                return new tce1[i];
            case 12:
                return new wde1[i];
            case 13:
                return new xde1[i];
            case 14:
                return new zde1[i];
            case 15:
                return new cee1[i];
            case 16:
                return new dee1[i];
            case 17:
                return new hee1[i];
            case 18:
                return new nee1[i];
            case 19:
                return new qee1[i];
            case 20:
                return new ree1[i];
            case 21:
                return new lje1[i];
            case 22:
                return new mje1[i];
            case 23:
                return new nje1[i];
            case 24:
                return new oje1[i];
            case 25:
                return new pje1[i];
            case 26:
                return new rje1[i];
            case 27:
                return new sje1[i];
            case 28:
                return new rne1[i];
            default:
                return new sne1[i];
        }
    }
}
