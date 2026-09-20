package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class dl3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f50109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl3(String str, int i) {
        super(0);
        this.f50108a = i;
        this.f50109b = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f50108a) {
            case 0:
                String str = this.f50109b;
                int length = str.length();
                return sam.m77645B(new o971(dvg1.m37112n(length, length), 4, str));
            case 1:
                return Uri.parse(this.f50109b);
            case 2:
                return this.f50109b;
            case 3:
                return new gyi0(this.f50109b, null, null);
            default:
                return new geg0(this.f50109b);
        }
    }
}
