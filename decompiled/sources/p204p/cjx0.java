package p204p;

import com.google.android.recaptcha.internal.zzag;
import com.google.android.recaptcha.internal.zzah;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class cjx0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f38700a;

    /* JADX INFO: renamed from: b */
    public int f38701b;

    public cjx0(int i) {
        switch (i) {
            case 1:
                this.f38700a = new ArrayList();
                this.f38701b = 0;
                break;
            default:
                this.f38700a = new ArrayList();
                this.f38701b = 128;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m33005a(long j) throws zzag {
        long j2;
        int[] iArr = {783368690, 2033355106, 1011212548, -1019590554, -1840431076, 450100676, 21082158, 1189641421, 1025202362};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iM79992g = t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 1025202362;
        long[] jArr = {572660336, 1946443174, 827031559, -838041696, -1952800191, 225735627, 63423617, 2084420925, 1937477084};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 1937477084;
        if (j >= 0) {
            j2 = ((long) (this.f38701b + (iM79992g ^ i9))) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.f38701b) {
            throw new zzag();
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: b */
    public void m33006b(ghf1 ghf1Var) {
        int[] iArr = {619290071, 707839669, 1439652248, 1857062437, 1153777986, -1073983953, 110861465, 1431419379, 620145550};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iM79992g = t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.f38701b;
        if (i9 >= ((i8 % 620145550) ^ iM79992g)) {
            throw new zzah();
        }
        ArrayList arrayList = this.f38700a;
        if (i9 == arrayList.size()) {
            arrayList.add(ghf1Var);
        } else {
            arrayList.set(this.f38701b, ghf1Var);
        }
        this.f38701b++;
    }

    /* JADX INFO: renamed from: c */
    public ghf1 m33007c() {
        int[] iArr = {1246322141, 1353851113, 767563284, -47045399, -1353918698, 1098913221, 38700441, 1600766768, 649830540};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iM79992g = t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 649830540;
        int i10 = this.f38701b;
        if (i10 <= 0) {
            throw new zzag();
        }
        int i11 = i9 ^ iM79992g;
        ArrayList arrayList = this.f38700a;
        ghf1 ghf1Var = (ghf1) arrayList.get(i10 + i11);
        arrayList.set(this.f38701b + i11, null);
        this.f38701b += i11;
        return ghf1Var;
    }

    /* JADX INFO: renamed from: d */
    public ghf1 m33008d(long j) {
        return (ghf1) this.f38700a.get(m33005a(j));
    }
}
