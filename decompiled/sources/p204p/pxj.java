package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pxj[], still in use, count: 1, list:
  (r0v1 p.pxj[]) from 0x002c: CONSTRUCTOR (r0v1 p.pxj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class pxj implements Parcelable {
    MUSIC("music"),
    PODCASTS("podcasts"),
    AUDIOBOOKS("audiobooks");

    public static final Parcelable.Creator<pxj> CREATOR = new n6f1(10);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f182319f;

    /* JADX INFO: renamed from: a */
    public final String f182320a;

    static {
        f182319f = new nzv(new pxj[]{r0, r1, r2});
    }

    public pxj(String str) {
        super(str, i);
        this.f182320a = str;
    }

    public static pxj valueOf(String str) {
        return (pxj) Enum.valueOf(pxj.class, str);
    }

    public static pxj[] values() {
        return (pxj[]) f182318e.clone();
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
