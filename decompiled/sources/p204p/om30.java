package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class om30 extends ml30 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f166963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om30(Class cls, int i) {
        super(cls);
        this.f166963f = i;
    }

    @Override // p204p.ml30, p204p.nl30
    /* JADX INFO: renamed from: f */
    public void mo36444f(ji10 ji10Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        switch (this.f166963f) {
            case 1:
                n7z0 n7z0Var = (n7z0) ji10Var;
                super.mo62199j(n7z0Var, fk30Var, sk30Var, mqrVar);
                n7z0Var.f151277f.setText(fk30Var.text().subtitle());
                break;
            case 2:
                o7z0 o7z0Var = (o7z0) ji10Var;
                super.mo62199j(o7z0Var, fk30Var, sk30Var, mqrVar);
                o7z0Var.f162664f.setText(fk30Var.text().subtitle());
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.mo36444f(ji10Var, fk30Var, sk30Var, mqrVar);
                break;
            case 6:
                mo62199j((h7z0) ji10Var, fk30Var, sk30Var, mqrVar);
                break;
            case 7:
                mo62199j((h7z0) ji10Var, fk30Var, sk30Var, mqrVar);
                break;
            case 8:
                mo62199j((h7z0) ji10Var, fk30Var, sk30Var, mqrVar);
                break;
            case 9:
                o7z0 o7z0Var2 = (o7z0) ji10Var;
                super.mo62199j(o7z0Var2, fk30Var, sk30Var, mqrVar);
                o7z0Var2.f162664f.setText(fk30Var.text().description());
                break;
            case 10:
                n7z0 n7z0Var2 = (n7z0) ji10Var;
                super.mo62199j(n7z0Var2, fk30Var, sk30Var, mqrVar);
                n7z0Var2.f151277f.setText(fk30Var.text().subtitle());
                break;
        }
    }

    @Override // p204p.nl30
    /* JADX INFO: renamed from: g */
    public final ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f166963f) {
            case 0:
                gg5 gg5Var = ((p7z0) this.f144748e).f174791b;
                boolean z = sk30Var.f209998k;
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader, viewGroup, false);
                h7z0 h7z0Var = new h7z0(viewInflate, z);
                viewInflate.setTag(R.id.glue_viewholder_tag, h7z0Var);
                return h7z0Var;
            case 1:
                gg5 gg5Var2 = ((p7z0) this.f144748e).f174791b;
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_metadata, viewGroup, false);
                n7z0 n7z0Var = new n7z0(viewInflate2);
                viewInflate2.setTag(R.id.glue_viewholder_tag, n7z0Var);
                return n7z0Var;
            case 2:
                gg5 gg5Var3 = ((p7z0) this.f144748e).f174791b;
                boolean z2 = sk30Var.f209998k;
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_subtitle, viewGroup, false);
                o7z0 o7z0Var = new o7z0(viewInflate3, z2);
                viewInflate3.setTag(R.id.glue_viewholder_tag, o7z0Var);
                return o7z0Var;
            case 3:
                gg5 gg5Var4 = ((p7z0) this.f144748e).f174791b;
                boolean z3 = sk30Var.f209998k;
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_extra_small, viewGroup, false);
                h7z0 h7z0Var2 = new h7z0(viewInflate4, z3);
                viewInflate4.setTag(R.id.glue_viewholder_tag, h7z0Var2);
                return h7z0Var2;
            case 4:
                gg5 gg5Var5 = ((p7z0) this.f144748e).f174791b;
                boolean z4 = sk30Var.f209998k;
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_large, viewGroup, false);
                h7z0 h7z0Var3 = new h7z0(viewInflate5, z4);
                viewInflate5.setTag(R.id.glue_viewholder_tag, h7z0Var3);
                return h7z0Var3;
            case 5:
                gg5 gg5Var6 = ((p7z0) this.f144748e).f174791b;
                boolean z5 = sk30Var.f209998k;
                View viewInflate6 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_small, viewGroup, false);
                h7z0 h7z0Var4 = new h7z0(viewInflate6, z5);
                viewInflate6.setTag(R.id.glue_viewholder_tag, h7z0Var4);
                return h7z0Var4;
            case 6:
                gg5 gg5Var7 = ((p7z0) this.f144748e).f174791b;
                boolean z6 = sk30Var.f209998k;
                View viewInflate7 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_large, viewGroup, false);
                h7z0 h7z0Var5 = new h7z0(viewInflate7, z6);
                viewInflate7.setTag(R.id.glue_viewholder_tag, h7z0Var5);
                return h7z0Var5;
            case 7:
                gg5 gg5Var8 = ((p7z0) this.f144748e).f174791b;
                boolean z7 = sk30Var.f209998k;
                View viewInflate8 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_small, viewGroup, false);
                h7z0 h7z0Var6 = new h7z0(viewInflate8, z7);
                viewInflate8.setTag(R.id.glue_viewholder_tag, h7z0Var6);
                return h7z0Var6;
            case 8:
                gg5 gg5Var9 = ((p7z0) this.f144748e).f174791b;
                boolean z8 = sk30Var.f209998k;
                View viewInflate9 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader, viewGroup, false);
                h7z0 h7z0Var7 = new h7z0(viewInflate9, z8);
                viewInflate9.setTag(R.id.glue_viewholder_tag, h7z0Var7);
                return h7z0Var7;
            case 9:
                gg5 gg5Var10 = ((p7z0) this.f144748e).f174791b;
                boolean z9 = sk30Var.f209998k;
                View viewInflate10 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_subtitle, viewGroup, false);
                o7z0 o7z0Var2 = new o7z0(viewInflate10, z9);
                viewInflate10.setTag(R.id.glue_viewholder_tag, o7z0Var2);
                return o7z0Var2;
            default:
                gg5 gg5Var11 = ((p7z0) this.f144748e).f174791b;
                View viewInflate11 = LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_metadata, viewGroup, false);
                n7z0 n7z0Var2 = new n7z0(viewInflate11);
                viewInflate11.setTag(R.id.glue_viewholder_tag, n7z0Var2);
                return n7z0Var2;
        }
    }

    @Override // p204p.ml30
    /* JADX INFO: renamed from: j */
    public void mo62199j(h7z0 h7z0Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        switch (this.f166963f) {
            case 1:
                n7z0 n7z0Var = (n7z0) h7z0Var;
                super.mo62199j(n7z0Var, fk30Var, sk30Var, mqrVar);
                n7z0Var.f151277f.setText(fk30Var.text().subtitle());
                break;
            case 2:
                o7z0 o7z0Var = (o7z0) h7z0Var;
                super.mo62199j(o7z0Var, fk30Var, sk30Var, mqrVar);
                o7z0Var.f162664f.setText(fk30Var.text().subtitle());
                break;
            case 9:
                o7z0 o7z0Var2 = (o7z0) h7z0Var;
                super.mo62199j(o7z0Var2, fk30Var, sk30Var, mqrVar);
                o7z0Var2.f162664f.setText(fk30Var.text().description());
                break;
            case 10:
                n7z0 n7z0Var2 = (n7z0) h7z0Var;
                super.mo62199j(n7z0Var2, fk30Var, sk30Var, mqrVar);
                n7z0Var2.f151277f.setText(fk30Var.text().subtitle());
                break;
            default:
                super.mo62199j(h7z0Var, fk30Var, sk30Var, mqrVar);
                break;
        }
    }
}
