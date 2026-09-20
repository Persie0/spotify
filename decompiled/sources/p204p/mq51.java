package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.mq51[], still in use, count: 1, list:
  (r0v1 p.mq51[]) from 0x0080: CONSTRUCTOR (r1v2 p.nzv) = (r0v1 p.mq51[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:129) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public final class mq51 implements Parcelable {
    Volume(R.string.mixing_edit_page_preset_style_volume, R.color.mixing_blue, "mixing_style_category_volume_button", pea.f176688a),
    Eq(R.string.mixing_edit_page_preset_style_eq, R.color.mixing_yellow, "mixing_style_category_eq_button", jea.f111516a),
    Filter(R.string.mixing_edit_page_preset_style_filter, R.color.mixing_purple, "mixing_style_category_filter_button", kea.f121840a),
    Effects(R.string.mixing_edit_page_preset_style_effects, R.color.mixing_gray, "mixing_style_category_effects_button", lea.f132496a),
    Looping(R.string.mixing_edit_page_preset_style_looping, R.color.mixing_orange, "mixing_style_category_looping_button", nea.f152967a),
    Jogwheel(R.string.mixing_edit_page_preset_style_jogwheel, R.color.mixing_dark_blue, "mixing_style_category_jogwheel_button", mea.f142643a);

    public static final Parcelable.Creator<mq51> CREATOR;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ nzv f146183Y;

    /* JADX INFO: renamed from: a */
    public final int f146190a;

    /* JADX INFO: renamed from: b */
    public final int f146191b;

    /* JADX INFO: renamed from: c */
    public final String f146192c;

    /* JADX INFO: renamed from: d */
    public final qea f146193d;

    static {
        nzv nzvVar = new nzv(mq51VarArr);
        f146183Y = nzvVar;
        CREATOR = new nc51(23);
        opo.m67574x(nzvVar);
        ArrayList arrayList = new ArrayList();
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        while (c2042k7.hasNext()) {
            Object next = c2042k7.next();
            if (!((mq51) next).m62513c()) {
                arrayList.add(next);
            }
        }
        opo.m67574x(arrayList);
        nzv nzvVar2 = f146183Y;
        ArrayList arrayList2 = new ArrayList();
        C2042k7 c2042k8 = new C2042k7(nzvVar2, 0);
        while (c2042k8.hasNext()) {
            Object next2 = c2042k8.next();
            if (((mq51) next2).m62513c()) {
                arrayList2.add(next2);
            }
        }
        opo.m67574x(arrayList2);
    }

    public mq51(int i, int i2, String str, qea qeaVar) {
        super(str, i);
        this.f146190a = i;
        this.f146191b = i2;
        this.f146192c = str;
        this.f146193d = qeaVar;
    }

    public static mq51 valueOf(String str) {
        return (mq51) Enum.valueOf(mq51.class, str);
    }

    public static mq51[] values() {
        return (mq51[]) f146182X.clone();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m62513c() {
        return this == Effects || this == Looping || this == Jogwheel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
