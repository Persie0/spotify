package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x8c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259108a;

    /* JADX INFO: renamed from: b */
    public int f259109b;

    /* JADX INFO: renamed from: c */
    public int f259110c;

    /* JADX INFO: renamed from: d */
    public int f259111d;

    /* JADX INFO: renamed from: e */
    public int f259112e;

    public x8c(int i) {
        this.f259108a = i;
        switch (i) {
            case 2:
                break;
            default:
                this.f259111d = 0;
                break;
        }
    }

    public String toString() {
        switch (this.f259108a) {
            case 1:
                int i = this.f259109b;
                int i2 = this.f259110c;
                int i3 = this.f259111d;
                int i4 = this.f259112e;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                return s571.m77248g(i4, ".", sb);
            default:
                return super.toString();
        }
    }

    public x8c(String str) {
        this.f259108a = 1;
        String[] strArrSplit = str.split("\\.");
        this.f259109b = Integer.parseInt(strArrSplit[0]);
        this.f259110c = Integer.parseInt(strArrSplit[1]);
        this.f259111d = Integer.parseInt(strArrSplit[2]);
        this.f259112e = Integer.parseInt(strArrSplit[3]);
    }
}
