package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.p073v1.DownloadLevel;
import com.spotify.graduation.p073v1.GraduationRequest;
import com.spotify.graduation.p073v1.GraduationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ruw0 implements th00 {

    /* JADX INFO: renamed from: a */
    public final zeo f202950a;

    public ruw0(zeo zeoVar) {
        this.f202950a = zeoVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        DownloadLevel downloadLevel;
        List list = (List) obj;
        fbk<? super o2x0<GraduationResponse>> fbkVar = (fbk) obj2;
        GraduationRequest.Builder builderNewBuilder = GraduationRequest.newBuilder();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = quw0.f192830a[((DataSectionType) it.next()).ordinal()];
            if (i == 1) {
                downloadLevel = DownloadLevel.ACCOUNT_DATA;
            } else if (i == 2) {
                downloadLevel = DownloadLevel.EXTENDED_STREAMING_HISTORY;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                downloadLevel = DownloadLevel.TECHNICAL_LOG_INFORMATION;
            }
            arrayList.add(downloadLevel);
        }
        builderNewBuilder.addAllLevels(arrayList);
        return this.f202950a.m95988b((GraduationRequest) builderNewBuilder.build(), fbkVar);
    }
}
