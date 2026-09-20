package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.p073v1.Download;
import com.spotify.graduation.p073v1.DownloadLevel;
import com.spotify.graduation.p073v1.DownloadStatus;
import com.spotify.graduation.p073v1.GetDownloadsRequest;
import com.spotify.graduation.p073v1.GetDownloadsResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class i810 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final zeo f99660a;

    /* JADX INFO: renamed from: b */
    public final m95 f99661b;

    public i810(zeo zeoVar, m95 m95Var) {
        this.f99660a = zeoVar;
        this.f99661b = m95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.gh00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fbk fbkVar) {
        h810 h810Var;
        Object obj;
        if (fbkVar instanceof h810) {
            h810Var = (h810) fbkVar;
            int i = h810Var.f88597c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h810Var.f88597c = i - Integer.MIN_VALUE;
            } else {
                h810Var = new h810(this, fbkVar);
            }
        } else {
            h810Var = new h810(this, fbkVar);
        }
        Object objM95987a = h810Var.f88595a;
        int i2 = h810Var.f88597c;
        if (i2 == 0) {
            bga.m29073P(objM95987a);
            GetDownloadsRequest.Builder builderNewBuilder = GetDownloadsRequest.newBuilder();
            builderNewBuilder.setUnused("-");
            GetDownloadsRequest getDownloadsRequest = (GetDownloadsRequest) builderNewBuilder.build();
            h810Var.f88597c = 1;
            objM95987a = this.f99660a.m95987a(getDownloadsRequest, h810Var);
            yuk yukVar = yuk.f276404a;
            if (objM95987a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM95987a);
        }
        o2x0 o2x0Var = (o2x0) objM95987a;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (!n2x0Var.f149852O0 || (obj = o2x0Var.f161172b) == null) {
            return new e810(n2x0Var.toString());
        }
        List<Download> downloadsList = ((GetDownloadsResponse) obj).getDownloadsList();
        wj50.m88279p(downloadsList);
        ae50 ae50Var = (ae50) downloadsList;
        return new d810(h6f.m46715L(m49903e(ae50Var, DataSectionType.ACCOUNT_DATA), m49903e(ae50Var, DataSectionType.TECHNICAL_LOG_INFORMATION), m49903e(ae50Var, DataSectionType.EXTENDED_STREAMING_HISTORY)));
    }

    /* JADX INFO: renamed from: e */
    public final hio m49903e(ae50 ae50Var, DataSectionType dataSectionType) {
        Object next;
        DataSectionStatus jioVar;
        DownloadLevel level;
        DownloadLevel downloadLevel;
        Iterator<E> it = ae50Var.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            level = ((Download) next).getLevel();
            int i = g810.f77387b[dataSectionType.ordinal()];
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
        } while (level != downloadLevel);
        Download download = (Download) next;
        if (download != null) {
            DownloadStatus status = download.getStatus();
            int i2 = status == null ? -1 : g810.f77386a[status.ordinal()];
            m95 m95Var = this.f99661b;
            if (i2 != 1) {
                jioVar = i2 != 2 ? lio.f133858a : new iio(m95Var.m61182k(download.getDate()), download.getDownloadUrl(), download.getSecurityCode());
            } else {
                jioVar = new jio(m95Var.m61182k(download.getDate()));
            }
        } else {
            jioVar = lio.f133858a;
        }
        return new hio(dataSectionType, jioVar);
    }
}
