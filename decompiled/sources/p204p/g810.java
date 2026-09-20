package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.p073v1.DownloadStatus;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g810 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f77386a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f77387b;

    static {
        int[] iArr = new int[DownloadStatus.values().length];
        try {
            iArr[DownloadStatus.REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DownloadStatus.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f77386a = iArr;
        int[] iArr2 = new int[DataSectionType.values().length];
        try {
            iArr2[DataSectionType.ACCOUNT_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DataSectionType.EXTENDED_STREAMING_HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DataSectionType.TECHNICAL_LOG_INFORMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f77387b = iArr2;
    }
}
