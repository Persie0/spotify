package androidx.car.app.dialer;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.ok40;
import p204p.rzb;
import p204p.ty61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class InCallTemplate implements ty61 {
    private static final int MAX_TEXTS_SIZE = 2;
    private final List<Action> mActions;
    private final Header mHeader;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final List<CarText> mTexts;
    private final CarText mTitle;

    private InCallTemplate(ok40 ok40Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InCallTemplate)) {
            return false;
        }
        InCallTemplate inCallTemplate = (InCallTemplate) obj;
        return Objects.equals(this.mHeader, inCallTemplate.mHeader) && Objects.equals(this.mIcon, inCallTemplate.mIcon) && Objects.equals(this.mTitle, inCallTemplate.mTitle) && Objects.equals(this.mTexts, inCallTemplate.mTexts) && Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public List<CarText> getTexts() {
        return this.mTexts;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "InCallTemplate";
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        List list = Collections.EMPTY_LIST;
        this.mTexts = list;
        this.mActions = list;
        this.mIsLoading = false;
    }
}
