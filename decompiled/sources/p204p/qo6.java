package p204p;

import com.spotify.bluejay.data.api.AttachmentUploadException;
import com.spotify.personalizedepisodes.contentservice.p124v1.ContentServiceError;
import com.spotify.personalizedepisodes.contentservice.p124v1.GetAttachmentStatusResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.ImageAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.p124v1.PdfAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.p124v1.UploadAttachmentRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.UploadAttachmentResponse;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class qo6 implements lo6 {

    /* JADX INFO: renamed from: a */
    public final up6 f190804a;

    /* JADX INFO: renamed from: b */
    public final np6 f190805b;

    public qo6(up6 up6Var, np6 np6Var) {
        this.f190804a = up6Var;
        this.f190805b = np6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m73365a(String str, ibk ibkVar) {
        no6 no6Var;
        if (ibkVar instanceof no6) {
            no6Var = (no6) ibkVar;
            int i = no6Var.f156597c;
            if ((i & Integer.MIN_VALUE) != 0) {
                no6Var.f156597c = i - Integer.MIN_VALUE;
            } else {
                no6Var = new no6(this, ibkVar);
            }
        } else {
            no6Var = new no6(this, ibkVar);
        }
        Object objM83649b = no6Var.f156595a;
        int i2 = no6Var.f156597c;
        if (i2 == 0) {
            bga.m29073P(objM83649b);
            no6Var.f156597c = 1;
            objM83649b = this.f190804a.m83649b(str, no6Var);
            yuk yukVar = yuk.f276404a;
            if (objM83649b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83649b);
        }
        o2x0 o2x0Var = (o2x0) objM83649b;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new HttpException(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get attachment status response");
        }
        GetAttachmentStatusResponse getAttachmentStatusResponse = (GetAttachmentStatusResponse) obj;
        int i3 = mo6.f145595a[getAttachmentStatusResponse.m17416o().ordinal()];
        if (i3 == 1) {
            return rp6.f201431a;
        }
        if (i3 != 2) {
            return pp6.f179888a;
        }
        return new qp6((!getAttachmentStatusResponse.m17417p() || wl51.m88460J0(getAttachmentStatusResponse.m17415n().getMessage())) ? null : getAttachmentStatusResponse.m17415n().getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m73366b(fea1 fea1Var, ibk ibkVar) {
        oo6 oo6Var;
        UploadAttachmentResponse uploadAttachmentResponse;
        o2x0 o2x0Var;
        if (ibkVar instanceof oo6) {
            oo6Var = (oo6) ibkVar;
            int i = oo6Var.f167477e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo6Var.f167477e = i - Integer.MIN_VALUE;
            } else {
                oo6Var = new oo6(this, ibkVar);
            }
        } else {
            oo6Var = new oo6(this, ibkVar);
        }
        Object objM83650c = oo6Var.f167475c;
        int i2 = oo6Var.f167477e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                fea1Var = oo6Var.f167473a;
                bga.m29073P(objM83650c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uploadAttachmentResponse = oo6Var.f167474b;
                bga.m29073P(objM83650c);
            }
            o2x0Var = (o2x0) objM83650c;
            if (o2x0Var.f161171a.f149852O0) {
                return new gea1(uploadAttachmentResponse.m17540n());
            }
            throw new HttpException(o2x0Var);
        }
        bga.m29073P(objM83650c);
        eea1 eea1VarM17539r = UploadAttachmentRequest.m17539r();
        eea1VarM17539r.m38648m(fea1Var.f68728a);
        eea1VarM17539r.m38649q(fea1Var.f68729b);
        dp6 dp6Var = fea1Var.f68731d;
        if (dp6Var instanceof cp6) {
            dhn0 dhn0VarM17433p = PdfAttachmentMetadata.m17433p();
            cp6 cp6Var = (cp6) dp6Var;
            Integer num = cp6Var.f40466a;
            if (num != null) {
                dhn0VarM17433p.m36054q(num.intValue());
            }
            Integer num2 = cp6Var.f40467b;
            if (num2 != null) {
                dhn0VarM17433p.m36053m(num2.intValue());
            }
            eea1VarM17539r.m38651s(dhn0VarM17433p);
        } else {
            if (!(dp6Var instanceof bp6)) {
                throw new NoWhenBranchMatchedException();
            }
            eea1VarM17539r.m38650r(ImageAttachmentMetadata.m17425n());
        }
        UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) eea1VarM17539r.build();
        oo6Var.f167473a = fea1Var;
        oo6Var.f167477e = 1;
        objM83650c = this.f190804a.m83650c(uploadAttachmentRequest, oo6Var);
        if (objM83650c != yukVar) {
        }
        return yukVar;
        o2x0 o2x0Var2 = (o2x0) objM83650c;
        n2x0 n2x0Var = o2x0Var2.f161171a;
        String str = n2x0Var.f149859c;
        int i3 = n2x0Var.f149860d;
        if (!n2x0Var.f149852O0) {
            p3x0 p3x0Var = o2x0Var2.f161173c;
            byte[] bArrM69092c = p3x0Var != null ? p3x0Var.m69092c() : null;
            if (bArrM69092c == null) {
                throw new AttachmentUploadException("", str, i3);
            }
            try {
                ContentServiceError contentServiceErrorM17373q = ContentServiceError.m17373q(bArrM69092c);
                throw new AttachmentUploadException(contentServiceErrorM17373q.m17375p(), contentServiceErrorM17373q.getMessage(), i3);
            } catch (Exception unused) {
                throw new AttachmentUploadException("", str, i3);
            }
        }
        Object obj = o2x0Var2.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful upload attachment metadata response");
        }
        UploadAttachmentResponse uploadAttachmentResponse2 = (UploadAttachmentResponse) obj;
        String strM17541o = uploadAttachmentResponse2.m17541o();
        String str2 = fea1Var.f68728a;
        cuw0 cuw0Var = fea1Var.f68730c;
        oo6Var.f167473a = null;
        oo6Var.f167474b = uploadAttachmentResponse2;
        oo6Var.f167477e = 2;
        Object objM65284a = this.f190805b.m65284a(strM17541o, str2, cuw0Var, oo6Var);
        if (objM65284a != yukVar) {
            objM83650c = objM65284a;
            uploadAttachmentResponse = uploadAttachmentResponse2;
            o2x0Var = (o2x0) objM83650c;
            if (o2x0Var.f161171a.f149852O0) {
                return new gea1(uploadAttachmentResponse.m17540n());
            }
            throw new HttpException(o2x0Var);
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (p204p.njg1.m64620m(r5, r0) == r4) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:29:0x0076). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m73367c(String str, ibk ibkVar) {
        po6 po6Var;
        int i;
        int i2;
        String str2;
        sp6 sp6Var;
        Object objM73365a;
        if (ibkVar instanceof po6) {
            po6Var = (po6) ibkVar;
            int i3 = po6Var.f179613e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                po6Var.f179613e = i3 - Integer.MIN_VALUE;
            } else {
                po6Var = new po6(this, ibkVar);
            }
        } else {
            po6Var = new po6(this, ibkVar);
        }
        Object obj = po6Var.f179611c;
        int i4 = po6Var.f179613e;
        Object obj2 = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(obj);
            i = 0;
            po6Var.f179609a = str;
            po6Var.f179610b = i;
            po6Var.f179613e = 1;
            objM73365a = m73365a(str, po6Var);
            if (objM73365a != obj2) {
                str2 = str;
                i2 = i;
                obj = objM73365a;
                sp6Var = (sp6) obj;
                if (sp6Var instanceof pp6) {
                }
                return sp6Var;
            }
            return obj2;
        }
        if (i4 == 1) {
            i2 = po6Var.f179610b;
            str2 = po6Var.f179609a;
            bga.m29073P(obj);
            sp6Var = (sp6) obj;
            if ((sp6Var instanceof pp6) || i2 >= 3) {
                return sp6Var;
            }
            hvi0 hvi0Var = cks.f39079b;
            long jM54449D = jwg1.m54449D(1 << (i2 + 1), ils.SECONDS);
            po6Var.f179609a = str2;
            po6Var.f179610b = i2;
            po6Var.f179613e = 2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = po6Var.f179610b;
            str2 = po6Var.f179609a;
            bga.m29073P(obj);
        }
        i = i2 + 1;
        str = str2;
        po6Var.f179609a = str;
        po6Var.f179610b = i;
        po6Var.f179613e = 1;
        objM73365a = m73365a(str, po6Var);
        if (objM73365a != obj2) {
            str2 = str;
            i2 = i;
            obj = objM73365a;
            sp6Var = (sp6) obj;
            if (sp6Var instanceof pp6) {
            }
            return sp6Var;
        }
        return obj2;
    }
}
