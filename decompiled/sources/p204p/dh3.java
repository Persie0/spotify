package p204p;

import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class dh3 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48969a;

    public /* synthetic */ dh3(int i) {
        this.f48969a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f48969a) {
            case 0:
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) obj;
                return Boolean.valueOf((yourLibraryResponse.m98199q().m98207t() == 0 || yourLibraryResponse.m98195b() == 0) && yourLibraryResponse.m98200r().isEmpty());
            case 1:
                YourLibraryResponse yourLibraryResponse2 = (YourLibraryResponse) obj;
                return Boolean.valueOf(yourLibraryResponse2.m98199q().m98207t() == 0 || yourLibraryResponse2.m98195b() == 0);
            default:
                YourLibraryResponse yourLibraryResponse3 = (YourLibraryResponse) obj;
                return Boolean.valueOf(yourLibraryResponse3.m98199q().m98207t() == 0 || yourLibraryResponse3.m98195b() == 0);
        }
    }
}
