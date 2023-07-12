package player;

public class Skills {
    // scoring
    private int threeBall = Constants.MIN_SKILL_VALUE;
    private int middy = Constants.MIN_SKILL_VALUE;
    private int layup = Constants.MIN_SKILL_VALUE;
    private int dunk = Constants.MIN_SKILL_VALUE;

    // playmaking
    private int handle = Constants.MIN_SKILL_VALUE;
    private int passing = Constants.MIN_SKILL_VALUE;
    private int postUp = Constants.MIN_SKILL_VALUE;

    // defense
    private int onBall = Constants.MIN_SKILL_VALUE;
    private int offBall = Constants.MIN_SKILL_VALUE;

    // accessors and mutators
    public int getThreeBall() {
        return threeBall;
    }

    public void setThreeBall(int threeBall) {
        if (threeBall < Constants.MIN_SKILL_VALUE) {
            this.threeBall = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (threeBall > Constants.MAX_SKILL_VALUE) {
            this.threeBall = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.threeBall = threeBall;
    }

    public int getMiddy() {
        return middy;
    }

    public void setMiddy(int middy) {
        if (middy < Constants.MIN_SKILL_VALUE) {
            this.middy = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (middy > Constants.MAX_SKILL_VALUE) {
            this.middy = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.middy = middy;
    }

    public int getLayup() {
        return layup;
    }

    public void setLayup(int layup) {
        if (layup < Constants.MIN_SKILL_VALUE) {
            this.layup = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (layup > Constants.MAX_SKILL_VALUE) {
            this.layup = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.layup = layup;
    }

    public int getDunk() {
        return dunk;
    }

    public void setDunk(int dunk) {
        if (dunk < Constants.MIN_SKILL_VALUE) {
            this.dunk = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (dunk > Constants.MAX_SKILL_VALUE) {
            this.dunk = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.dunk = dunk;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        if (handle < Constants.MIN_SKILL_VALUE) {
            this.handle = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (handle > Constants.MAX_SKILL_VALUE) {
            this.handle = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.handle = handle;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        if (passing < Constants.MIN_SKILL_VALUE) {
            this.passing = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (passing > Constants.MAX_SKILL_VALUE) {
            this.passing = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.passing = passing;
    }

    public int getPostUp() {
        return postUp;
    }

    public void setPostUp(int postUp) {
        if (postUp < Constants.MIN_SKILL_VALUE) {
            this.postUp = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (postUp > Constants.MAX_SKILL_VALUE) {
            this.postUp = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.postUp = postUp;
    }

    public int getOnBall() {
        return onBall;
    }

    public void setOnBall(int onBall) {
        if (onBall < Constants.MIN_SKILL_VALUE) {
            this.onBall = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (onBall > Constants.MAX_SKILL_VALUE) {
            this.onBall = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.onBall = onBall;
    }

    public int getOffBall() {
        return offBall;
    }

    public void setOffBall(int offBall) {
        if (offBall < Constants.MIN_SKILL_VALUE) {
            this.offBall = Constants.MIN_SKILL_VALUE;
            return;
        }
        if (offBall > Constants.MAX_SKILL_VALUE) {
            this.offBall = Constants.MAX_SKILL_VALUE;
            return;
        }
        this.offBall = offBall;
    }
}
