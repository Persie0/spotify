package androidx.car.app.model;

import java.util.Objects;
import p204p.rzb;
import p204p.ty61;
import p204p.yi61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final ty61 mTemplate;

    public TabContents(yi61 yi61Var) {
        this.mTemplate = yi61Var.f273055a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public ty61 getTemplate() {
        ty61 ty61Var = this.mTemplate;
        Objects.requireNonNull(ty61Var);
        return ty61Var;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
