package p204p;

import android.graphics.Paint;
import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes5.dex */
public final class zj80 implements LineHeightSpan, ParcelableSpan {

    /* JADX INFO: renamed from: a */
    public final int f283392a;

    public zj80(int i) {
        this.f283392a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int i7 = this.f283392a;
            int iM72083N = q3d0.m72083N(i5 * ((i7 * 1.0f) / i6));
            fontMetricsInt.descent = iM72083N;
            fontMetricsInt.ascent = iM72083N - i7;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.ParcelableSpan
    public final int getSpanTypeId() {
        return 28;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f283392a);
    }
}
