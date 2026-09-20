package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh50 extends ri00 implements th00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f143708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh50(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f143708h = i4;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143708h) {
            case 0:
                return Boolean.valueOf(((qh50) this.f78014b).m72789z0((r300) obj, (List) obj2));
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                return Boolean.valueOf(al60.m26270a((al60) this.f78014b, (ktz0) obj, iIntValue));
            default:
                return kje0.m56577e((kje0) this.f78014b, (hje0) obj, (ebf0) obj2);
        }
    }
}
