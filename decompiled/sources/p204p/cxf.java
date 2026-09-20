package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cxf {

    /* JADX INFO: renamed from: a */
    public final List f43018a;

    /* JADX INFO: renamed from: b */
    public final List f43019b;

    /* JADX INFO: renamed from: c */
    public final List f43020c;

    /* JADX INFO: renamed from: d */
    public List f43021d;

    /* JADX INFO: renamed from: e */
    public List f43022e;

    /* JADX INFO: renamed from: f */
    public final wg61 f43023f;

    /* JADX INFO: renamed from: g */
    public final wg61 f43024g;

    public cxf(List list, List list2, List list3, List list4, List list5) {
        this.f43018a = list;
        this.f43019b = list2;
        this.f43020c = list3;
        this.f43021d = list4;
        this.f43022e = list5;
        final int i = 0;
        this.f43023f = new wg61(new eh00(this) { // from class: p.axf

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ cxf f20846b;

            {
                this.f20846b = this;
            }

            @Override // p204p.eh00
            public final Object invoke() {
                switch (i) {
                    case 0:
                        cxf cxfVar = this.f20846b;
                        List list6 = cxfVar.f43021d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            j6f.m52564V((List) ((eh00) list6.get(i2)).invoke(), arrayList);
                        }
                        cxfVar.f43021d = lau.f131415a;
                        return arrayList;
                    default:
                        cxf cxfVar2 = this.f20846b;
                        List list7 = cxfVar2.f43022e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            j6f.m52564V((List) ((eh00) list7.get(i3)).invoke(), arrayList2);
                        }
                        cxfVar2.f43022e = lau.f131415a;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.f43024g = new wg61(new eh00(this) { // from class: p.axf

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ cxf f20846b;

            {
                this.f20846b = this;
            }

            @Override // p204p.eh00
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        cxf cxfVar = this.f20846b;
                        List list6 = cxfVar.f43021d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            j6f.m52564V((List) ((eh00) list6.get(i3)).invoke(), arrayList);
                        }
                        cxfVar.f43021d = lau.f131415a;
                        return arrayList;
                    default:
                        cxf cxfVar2 = this.f20846b;
                        List list7 = cxfVar2.f43022e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            j6f.m52564V((List) ((eh00) list7.get(i4)).invoke(), arrayList2);
                        }
                        cxfVar2.f43022e = lau.f131415a;
                        return arrayList2;
                }
            }
        });
    }
}
