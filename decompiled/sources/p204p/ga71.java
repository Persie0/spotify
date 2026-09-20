package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class ga71 extends AbstractC2202o5 {
    public static final Parcelable.Creator<ga71> CREATOR = new fb31(17);

    /* JADX INFO: renamed from: c */
    public CharSequence f77993c;

    /* JADX INFO: renamed from: d */
    public boolean f77994d;

    /* JADX INFO: renamed from: e */
    public CharSequence f77995e;

    /* JADX INFO: renamed from: f */
    public CharSequence f77996f;

    /* JADX INFO: renamed from: g */
    public CharSequence f77997g;

    public ga71(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f77993c = (CharSequence) creator.createFromParcel(parcel);
        this.f77994d = parcel.readInt() == 1;
        this.f77995e = (CharSequence) creator.createFromParcel(parcel);
        this.f77996f = (CharSequence) creator.createFromParcel(parcel);
        this.f77997g = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f77993c) + " hint=" + ((Object) this.f77995e) + " helperText=" + ((Object) this.f77996f) + " placeholderText=" + ((Object) this.f77997g) + "}";
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f77993c, parcel, i);
        parcel.writeInt(this.f77994d ? 1 : 0);
        TextUtils.writeToParcel(this.f77995e, parcel, i);
        TextUtils.writeToParcel(this.f77996f, parcel, i);
        TextUtils.writeToParcel(this.f77997g, parcel, i);
    }
}
