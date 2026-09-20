package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class uic1 implements Function, rwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230657a;

    /* JADX INFO: renamed from: a */
    public static yic1 m83194a(hjc1 hjc1Var, wic1 wic1Var) {
        return new yic1(hjc1Var, wic1Var, cdl.f36908b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        ae50<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM98196n, 10));
        for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : ae50VarM98196n) {
            String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri();
            String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getName();
            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r() == toe1.f222242a) {
                i = 2;
            } else {
                toe1 toe1VarM98262r = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r();
                toe1 toe1Var = toe1.f222244c;
                if (toe1VarM98262r == toe1Var) {
                    String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri();
                    if (uri2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || uri2.equals("spotify:collection:tracks") || uri2.equals("spotify:internal:collection:tracks") || (bm51.m29803n0(uri2, "spotify:user:", false) && bm51.m29796g0(uri2, ":collection", false))) {
                        i = 3;
                    } else if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r() == toe1Var) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r() == toe1Var) {
                    i = 1;
                } else {
                    i = 4;
                }
            }
            arrayList.add(new yyk0(uri, name, i));
        }
        return arrayList;
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        switch (this.f230657a) {
            case 2:
                return new e8g0();
            default:
                return new ktg1((c8g0) sef0Var.mo54438a(c8g0.class));
        }
    }

    public uic1(vaa1 vaa1Var) {
        this.f230657a = 1;
    }
}
